package id.ac.unpas.functionalcompose.model

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class SetoranSampah(
    @PrimaryKey val id: String,
    val namabarber: String,
    val tanggallahir: String,
    val nama: String,
    val jenismember: String,
    val potonganharga: String
)
