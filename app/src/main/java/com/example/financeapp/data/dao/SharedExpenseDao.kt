package com.pae.app_finanzas_virtual.data.dao

import androidx.room.*
import com.example.financeapp.data.model.SharedExpense
import kotlinx.coroutines.flow.Flow

@Dao
interface SharedExpenseDao {

    // Paso 2: Método insert
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(sharedExpense: SharedExpense)

    // Paso 3: Método getSharedExpensesByUser
    @Query("SELECT * FROM shared_expenses WHERE creatorUserId = :userId ORDER BY date DESC")
    fun getSharedExpensesByUser(userId: Long): Flow<List<SharedExpense>>

    // Paso 4: Método getUnsettledSharedExpenses
    @Query("SELECT * FROM shared_expenses WHERE creatorUserId = :userId AND settled = 0")
    fun getUnsettledSharedExpenses(userId: Long): Flow<List<SharedExpense>>

    // Paso 5: Métodos update y delete
    @Update
    suspend fun update(sharedExpense: SharedExpense)

    @Delete
    suspend fun delete(sharedExpense: SharedExpense)
}