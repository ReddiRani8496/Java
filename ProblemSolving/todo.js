document.getElementById("add-button").addEventListener("click", function () {
  var todoInput = document.getElementById("todo-input");
  var todoList = document.getElementById("todo-list");
  var newTodo = document.createElement("li");
  newTodo.innerText = todoInput.value;
  todoList.appendChild(newTodo);
  todoInput.value = "";
});
