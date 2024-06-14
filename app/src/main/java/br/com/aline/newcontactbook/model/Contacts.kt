package br.com.aline.newcontactbook.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import br.com.aline.newcontactbook.constant.Constants

@Entity(tableName = Constants.CONTACTS_TABLE)
data class Contacts(
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "surname")
    val surname: String,
    @ColumnInfo(name = "phone1")
    val phone1: String,
    @ColumnInfo(name = "phone2")
    val phone2: String,
    @ColumnInfo(name = "cpf")
    val cpf: String,
    @ColumnInfo(name = "uf")
    val uf: String,
    @ColumnInfo(name = "birthDate")
    val birthDate: String,
    @ColumnInfo(name = "createdAt")
    val createdAt:String
){
    @PrimaryKey(autoGenerate = true)
    var uid: Int = 0
}
