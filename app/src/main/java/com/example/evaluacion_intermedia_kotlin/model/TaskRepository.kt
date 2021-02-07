package com.example.evaluacion_intermedia_kotlin.model

import androidx.lifecycle.LiveData

class TaskRepository(private val taskDao : TaskDao) {

    // En esto se contiene toda la info la base de datos
    val ListAllTask : LiveData<List<TaskEntity>> = taskDao.getAllTask()

    suspend fun insertTask(task : TaskEntity){
        taskDao.insertTask(task)
    }
    suspend fun updateTask(task: TaskEntity){
        taskDao.updateTask(task)
    }
    suspend fun deleteAll(){
        taskDao.deleteAll()
    }
    suspend fun deleteTask(task : TaskEntity){
        taskDao.deleteTask(task)
    }
    fun getTaskById(id : Int): LiveData<TaskEntity>{
        return taskDao.getTaskById(id)
    }
}