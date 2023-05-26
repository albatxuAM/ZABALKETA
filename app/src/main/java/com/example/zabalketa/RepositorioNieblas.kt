package com.example.zabalketa

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class RepositorioNieblas(val miDAO: NieblaDAO) {
    val listaNieblas: Flow<List<Niebla>> = miDAO.MostrarTodas()
    val listaNieblas2: Flow<List<NieblaClase>> = miDAO.MostrarTodasNieblas()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insertarDensidad(miDensidad: Densidad){
        miDAO.insertarDensidad(miDensidad)
    }

    fun mostrarTodasDensidades(): Flow<List<Densidad>>{
        return miDAO.mostrarTodasDensidades()
    }

    fun buscarDensidadPorId(id:Int):Flow<Densidad>{
        return miDAO.buscarDensidadPorId(id)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insertarFranjasHoraria(miFranjasHoraria: FranjaHoraria){
        miDAO.insertarFranjaHoraria(miFranjasHoraria)
    }

    fun mostrarTodasFranjasHorarias(): Flow<List<FranjaHoraria>>{
        return miDAO.mostrarTodasFranjasHorarias()
    }

    fun buscarFranjasHorariaPorId(id:Int):Flow<FranjaHoraria>{
        return miDAO.buscarFranjasHorariaPorId(id)
    }


    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun Insertar(miNiebla: Niebla) {
        miDAO.Insertar(miNiebla)
    }

    fun BuscarPorID(id:Int): Flow<Niebla> {
        return miDAO.BuscarPorID(id)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun Borrar(miNiebla: Niebla) {
        miDAO.Borrar(miNiebla)
    }

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun Actualizar(miNiebla: Niebla) {
        miDAO.Actualizar(miNiebla)
    }

    fun mostrarTodasNieblas(): Flow<List<NieblaClase>> {
        return miDAO.MostrarTodasNieblas()
    }

    fun mostrarTodas(): Flow<List<Niebla>> {
        return miDAO.MostrarTodas()
    }

}