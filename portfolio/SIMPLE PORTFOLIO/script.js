document.addEventListener("DOMContentLoaded", function() {
    fetch('/projects')
        .then(response => response.text())
        .then(data => {
            document.getElementById('project-list').innerHTML = data;
        })
        .catch(error => console.error('Error fetching projects:', error));
});
