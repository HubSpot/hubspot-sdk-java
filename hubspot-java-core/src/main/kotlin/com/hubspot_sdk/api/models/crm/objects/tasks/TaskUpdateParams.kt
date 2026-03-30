// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.tasks

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInput
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Perform a partial update of an Object identified by `{taskId}`or optionally a unique property
 * value as specified by the `idProperty` query param. `{taskId}` refers to the internal object ID
 * by default, and the `idProperty` query param refers to a property whose values are unique for the
 * object. Provided property values will be overwritten. Read-only and non-existent properties will
 * result in an error. Properties values can be cleared by passing an empty string.
 */
class TaskUpdateParams
private constructor(
    private val taskId: String?,
    private val idProperty: String?,
    private val simplePublicObjectInput: SimplePublicObjectInput,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun taskId(): Optional<String> = Optional.ofNullable(taskId)

    /** The name of a property whose values are unique for this object type */
    fun idProperty(): Optional<String> = Optional.ofNullable(idProperty)

    /**
     * Represents the input required to create or update a CRM object, containing an object with
     * property names and their corresponding values.
     */
    fun simplePublicObjectInput(): SimplePublicObjectInput = simplePublicObjectInput

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        simplePublicObjectInput._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TaskUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .simplePublicObjectInput()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TaskUpdateParams]. */
    class Builder internal constructor() {

        private var taskId: String? = null
        private var idProperty: String? = null
        private var simplePublicObjectInput: SimplePublicObjectInput? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(taskUpdateParams: TaskUpdateParams) = apply {
            taskId = taskUpdateParams.taskId
            idProperty = taskUpdateParams.idProperty
            simplePublicObjectInput = taskUpdateParams.simplePublicObjectInput
            additionalHeaders = taskUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = taskUpdateParams.additionalQueryParams.toBuilder()
        }

        fun taskId(taskId: String?) = apply { this.taskId = taskId }

        /** Alias for calling [Builder.taskId] with `taskId.orElse(null)`. */
        fun taskId(taskId: Optional<String>) = taskId(taskId.getOrNull())

        /** The name of a property whose values are unique for this object type */
        fun idProperty(idProperty: String?) = apply { this.idProperty = idProperty }

        /** Alias for calling [Builder.idProperty] with `idProperty.orElse(null)`. */
        fun idProperty(idProperty: Optional<String>) = idProperty(idProperty.getOrNull())

        /**
         * Represents the input required to create or update a CRM object, containing an object with
         * property names and their corresponding values.
         */
        fun simplePublicObjectInput(simplePublicObjectInput: SimplePublicObjectInput) = apply {
            this.simplePublicObjectInput = simplePublicObjectInput
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
         * Returns an immutable instance of [TaskUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .simplePublicObjectInput()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TaskUpdateParams =
            TaskUpdateParams(
                taskId,
                idProperty,
                checkRequired("simplePublicObjectInput", simplePublicObjectInput),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): SimplePublicObjectInput = simplePublicObjectInput

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> taskId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                idProperty?.let { put("idProperty", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TaskUpdateParams &&
            taskId == other.taskId &&
            idProperty == other.idProperty &&
            simplePublicObjectInput == other.simplePublicObjectInput &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            taskId,
            idProperty,
            simplePublicObjectInput,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TaskUpdateParams{taskId=$taskId, idProperty=$idProperty, simplePublicObjectInput=$simplePublicObjectInput, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
