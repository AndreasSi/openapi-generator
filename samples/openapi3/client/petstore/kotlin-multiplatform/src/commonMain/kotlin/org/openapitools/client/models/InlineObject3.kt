/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import kotlinx.serialization.*
import kotlinx.serialization.internal.CommonEnumSerializer
/**
 * 
 * @param integer None
 * @param int32 None
 * @param int64 None
 * @param number None
 * @param float None
 * @param double None
 * @param string None
 * @param patternWithoutDelimiter None
 * @param byte None
 * @param binary None
 * @param date None
 * @param dateTime None
 * @param password None
 * @param callback None
 */
@Serializable
data class InlineObject3 (
    /* None */
    @SerialName(value = "number") @Required val number: kotlin.Double,
    /* None */
    @SerialName(value = "double") @Required val double: kotlin.Double,
    /* None */
    @SerialName(value = "pattern_without_delimiter") @Required val patternWithoutDelimiter: kotlin.String,
    /* None */
    @SerialName(value = "byte") @Required val byte: org.openapitools.client.infrastructure.Base64ByteArray,
    /* None */
    @SerialName(value = "integer") val integer: kotlin.Int? = null,
    /* None */
    @SerialName(value = "int32") val int32: kotlin.Int? = null,
    /* None */
    @SerialName(value = "int64") val int64: kotlin.Long? = null,
    /* None */
    @SerialName(value = "float") val float: kotlin.Float? = null,
    /* None */
    @SerialName(value = "string") val string: kotlin.String? = null,
    /* None */
    @SerialName(value = "binary") val binary: org.openapitools.client.infrastructure.OctetByteArray? = null,
    /* None */
    @SerialName(value = "date") val date: kotlin.String? = null,
    /* None */
    @SerialName(value = "dateTime") val dateTime: kotlin.String? = null,
    /* None */
    @SerialName(value = "password") val password: kotlin.String? = null,
    /* None */
    @SerialName(value = "callback") val callback: kotlin.String? = null
) 



