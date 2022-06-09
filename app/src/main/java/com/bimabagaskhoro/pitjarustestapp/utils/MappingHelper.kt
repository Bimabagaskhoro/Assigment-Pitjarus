package com.bimabagaskhoro.pitjarustestapp.utils

import com.bimabagaskhoro.pitjarustestapp.data.remote.response.StoresItem
import com.bimabagaskhoro.pitjarustestapp.domain.model.Stores

object MappingHelper {
    fun entitiesToDomain(data: List<StoresItem>): List<Stores> =
        data.map {
            Stores(
                storeId = it.storeId,
                storeCode = it.storeCode,
                channelName = it.channelName,
                areaName = it.areaName,
                address = it.address,
                dcName = it.dcName,
                latitude = it.latitude,
                regionId = it.regionId,
                areaId = it.areaId,
                accountId = it.accountId,
                dcId = it.dcId,
                subchannelId = it.subchannelId,
                accountName = it.accountName,
                storeName = it.storeName,
                subchannelName = it.subchannelName,
                regionName = it.regionName,
                channelId = it.channelId,
                longitude = it.longitude
            )
        }
}