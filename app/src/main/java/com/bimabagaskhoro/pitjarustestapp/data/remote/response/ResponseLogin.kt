package com.bimabagaskhoro.pitjarustestapp.data.remote.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ResponseLogin(

	@field:SerializedName("stores")
	val stores: List<StoresItem>,

	@field:SerializedName("message")
	val message: String,

	@field:SerializedName("status")
	val status: String
) : Parcelable

@Parcelize
data class StoresItem(

	@field:SerializedName("store_id")
	val storeId: String,

	@field:SerializedName("store_code")
	val storeCode: String,

	@field:SerializedName("channel_name")
	val channelName: String,

	@field:SerializedName("area_name")
	val areaName: String,

	@field:SerializedName("address")
	val address: String,

	@field:SerializedName("dc_name")
	val dcName: String,

	@field:SerializedName("latitude")
	val latitude: String,

	@field:SerializedName("region_id")
	val regionId: String,

	@field:SerializedName("area_id")
	val areaId: String,

	@field:SerializedName("account_id")
	val accountId: String,

	@field:SerializedName("dc_id")
	val dcId: String,

	@field:SerializedName("subchannel_id")
	val subchannelId: String,

	@field:SerializedName("account_name")
	val accountName: String,

	@field:SerializedName("store_name")
	val storeName: String,

	@field:SerializedName("subchannel_name")
	val subchannelName: String,

	@field:SerializedName("region_name")
	val regionName: String,

	@field:SerializedName("channel_id")
	val channelId: String,

	@field:SerializedName("longitude")
	val longitude: String
) : Parcelable
