package com.weavey.xnotes.bean_json

import android.os.Parcel
import android.os.Parcelable
import org.litepal.crud.DataSupport
import java.io.Serializable

/**
 * Created by Weavey on 2017-06-15.var
 */
data class NotesType(var id: Int,var notesType: String, var orderType: Int): DataSupport(),Serializable
