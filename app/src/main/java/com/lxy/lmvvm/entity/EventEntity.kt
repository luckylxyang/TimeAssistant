package com.lxy.lmvvm.entity

/**
 * @Author liuxy
 * @Date 2024/10/28
 * @Desc 事件类型的实体类
 */
data class EventEntity(
    val id: Long,
    val name:String,
    val createTime: Long,
    val createUser: Long,
    val eventType: String,
    val icon: String,
    val deadLine: Long,
    val archivingTime: Long, // 归档时间
    val checkTime: Long,
    val check: Boolean,
)
