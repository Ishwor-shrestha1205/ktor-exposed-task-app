package com.example.model

interface TaskRepository {
    // "suspend" will allow implementations of the interface methods to start jobs of work on a different Coroutine Dispatcher
    suspend fun allTasks(): List<Task>
    suspend fun tasksByPriority(priority: Priority): List<Task>
    suspend fun taskByName(name: String): Task?
    suspend fun addTask(task: Task)
    suspend fun removeTask(name: String): Boolean
}