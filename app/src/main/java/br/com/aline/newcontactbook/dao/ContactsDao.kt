package br.com.aline.newcontactbook.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import br.com.aline.newcontactbook.model.Contacts

@Dao
interface ContactsDao {

    @Insert
    fun insertContact(contactList: MutableList<Contacts>)

    @Query("SELECT * FROM contacts_table ORDER BY name ASC")
    fun getContacts():MutableList<Contacts>

    @Query("UPDATE contacts_table SET name = :newName, surname = :newSurname, phone1 = :newPhone1, phone2 = :newPhone2, cpf = :newCpf, uf = :newUf, birthDate = :newBirthDate WHERE uid = :id")
    fun updateContact(id: Int, newName:String, newSurname: String, newPhone1: String, newPhone2: String, newCpf: String, newUf:String, newBirthDate:String)

    @Query("DELETE FROM contacts_table WHERE uid =:id")
    fun deleteContact(id: Int)



}