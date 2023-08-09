document.addEventListener("DOMContentLoaded", function () {
    const checkboxes = document.querySelectorAll("input[type='checkbox']");
    const submitButton = document.getElementById("submitButton");
	const clearButton = document.getElementById("clearButton");
	
    submitButton.addEventListener("click", function () {
        const selectedOptions = [];

        checkboxes.forEach(function (checkbox) {
            if (checkbox.checked) {
                selectedOptions.push(checkbox.parentElement.textContent.trim());
            }
        });
        
   
        if (selectedOptions.length > 0) {
            // Save selected options to a text file
            saveToFile(selectedOptions);
            // Clear checkboxes
            checkboxes.forEach(function (checkbox) {
                checkbox.checked = false;
            });
        } else {
            alert("No options selected.");
        }
    });
    
    clearButton.addEventListener("click", function () {
        checkboxes.forEach(function (checkbox) {
            checkbox.checked = false;
        });
    });      

    
	// create function to save the user input to the file
    function saveToFile(options) {
        const textToSave = options.join("\n");
        const blob = new Blob([textToSave], { type: "text/plain" });
        const url = URL.createObjectURL(blob);
        const a = document.createElement("a");
        a.href = url;
        a.download = "selected_options.txt";
        a.click();
        URL.revokeObjectURL(url);
    }
});
