package io.pikassa.sdk.entities

/**
Created by pikassa, support@pikassa.io on 26,Июнь,2020
All rights received.
 */
/**
 * Class representing body of payment request
 */
data class BodyRequest<D>(
    val requestId: String,
    val paymentMethod: String,
    val details: D
)