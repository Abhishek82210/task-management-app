const apiUrl = "http://localhost:8080/api/tasks"; // backend api url

// Load tasks when page loads
document.addEventListener("DOMContentLoaded", fetchTasks);

// Form submit event to add a new task
document.getElementById("taskForm").addEventListener("submit", async function (event) {
    event.preventDefault();
    const title = document.getElementById("title").value;
    const description = document.getElementById("description").value;
    const status = document.getElementById("status").value;

    const newTask = { title, description, status };

    const response = await fetch(apiUrl, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(newTask),
    });

    if (response.ok) {
        fetchTasks(); // Reload Task list
        this.reset(); // Clear form 
    }
});

// Function to fetch and display tasks
async function fetchTasks() {
    try {
        const response = await fetch(apiUrl);
        const tasks = await response.json(); // ✅ Fixed json() function

        const taskList = document.getElementById("taskList");
        taskList.innerHTML = ""; // Clear previous tasks 

        tasks.forEach((task) => {
            const taskDiv = document.createElement("div");
            taskDiv.classList.add("task");

            taskDiv.innerHTML = `
                <span><strong>${task.title}</strong> - ${task.description} (${task.status})</span>
                <div class="actions">
                    <button onclick="updateTask(${task.id})">📝</button>
                    <button onclick="deleteTask(${task.id})">❌</button>
                </div>
            `;
            taskList.appendChild(taskDiv);
        });
    } catch (error) {
        console.error("Error fetching tasks:", error);
    }
}

// Fetch function to delete a task
async function deleteTask(id) {
    await fetch(`${apiUrl}/${id}`, { method: "DELETE" }); // ✅ Fixed URL
    fetchTasks(); // Refresh task list
}

// Function to update a task
async function updateTask(id) {
    const newTitle = prompt("Enter new Title:");
    const newDescription = prompt("Enter new Description:");
    const newStatus = prompt("Enter Status (pending/completed):");

    if (!newTitle || !newDescription || !newStatus) return;

    const updatedTask = { title: newTitle, description: newDescription, status: newStatus };

    await fetch(`${apiUrl}/${id}`, { // ✅ Fixed URL
        method: "PUT",
        headers: { "Content-Type": "application/json" }, // ✅ Fixed Content-Type format
        body: JSON.stringify(updatedTask),
    });

    fetchTasks(); // Refresh task list
}
