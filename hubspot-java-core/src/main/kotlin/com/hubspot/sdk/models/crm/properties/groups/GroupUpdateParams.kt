// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.properties.groups

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.PropertyGroupUpdate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Perform a partial update of a property group identified by {groupName}. Provided fields will be
 * overwritten.
 */
class GroupUpdateParams
private constructor(
    private val objectType: String,
    private val groupName: String?,
    private val propertyGroupUpdate: PropertyGroupUpdate,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun objectType(): String = objectType

    fun groupName(): Optional<String> = Optional.ofNullable(groupName)

    fun propertyGroupUpdate(): PropertyGroupUpdate = propertyGroupUpdate

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        propertyGroupUpdate._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GroupUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .objectType()
         * .propertyGroupUpdate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GroupUpdateParams]. */
    class Builder internal constructor() {

        private var objectType: String? = null
        private var groupName: String? = null
        private var propertyGroupUpdate: PropertyGroupUpdate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(groupUpdateParams: GroupUpdateParams) = apply {
            objectType = groupUpdateParams.objectType
            groupName = groupUpdateParams.groupName
            propertyGroupUpdate = groupUpdateParams.propertyGroupUpdate
            additionalHeaders = groupUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = groupUpdateParams.additionalQueryParams.toBuilder()
        }

        fun objectType(objectType: String) = apply { this.objectType = objectType }

        fun groupName(groupName: String?) = apply { this.groupName = groupName }

        /** Alias for calling [Builder.groupName] with `groupName.orElse(null)`. */
        fun groupName(groupName: Optional<String>) = groupName(groupName.getOrNull())

        fun propertyGroupUpdate(propertyGroupUpdate: PropertyGroupUpdate) = apply {
            this.propertyGroupUpdate = propertyGroupUpdate
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [GroupUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectType()
         * .propertyGroupUpdate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GroupUpdateParams =
            GroupUpdateParams(
                checkRequired("objectType", objectType),
                groupName,
                checkRequired("propertyGroupUpdate", propertyGroupUpdate),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PropertyGroupUpdate = propertyGroupUpdate

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> objectType
            1 -> groupName ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GroupUpdateParams &&
            objectType == other.objectType &&
            groupName == other.groupName &&
            propertyGroupUpdate == other.propertyGroupUpdate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            objectType,
            groupName,
            propertyGroupUpdate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "GroupUpdateParams{objectType=$objectType, groupName=$groupName, propertyGroupUpdate=$propertyGroupUpdate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
