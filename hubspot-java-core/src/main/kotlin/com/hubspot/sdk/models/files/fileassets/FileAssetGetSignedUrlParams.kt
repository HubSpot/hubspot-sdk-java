// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.files.fileassets

import com.fasterxml.jackson.annotation.JsonCreator
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Generates signed URL that allows temporary access to a private file. */
class FileAssetGetSignedUrlParams
private constructor(
    private val fileId: String?,
    private val expirationSeconds: Long?,
    private val size: Size?,
    private val upscale: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun fileId(): Optional<String> = Optional.ofNullable(fileId)

    fun expirationSeconds(): Optional<Long> = Optional.ofNullable(expirationSeconds)

    fun size(): Optional<Size> = Optional.ofNullable(size)

    fun upscale(): Optional<Boolean> = Optional.ofNullable(upscale)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FileAssetGetSignedUrlParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [FileAssetGetSignedUrlParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileAssetGetSignedUrlParams]. */
    class Builder internal constructor() {

        private var fileId: String? = null
        private var expirationSeconds: Long? = null
        private var size: Size? = null
        private var upscale: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fileAssetGetSignedUrlParams: FileAssetGetSignedUrlParams) = apply {
            fileId = fileAssetGetSignedUrlParams.fileId
            expirationSeconds = fileAssetGetSignedUrlParams.expirationSeconds
            size = fileAssetGetSignedUrlParams.size
            upscale = fileAssetGetSignedUrlParams.upscale
            additionalHeaders = fileAssetGetSignedUrlParams.additionalHeaders.toBuilder()
            additionalQueryParams = fileAssetGetSignedUrlParams.additionalQueryParams.toBuilder()
        }

        fun fileId(fileId: String?) = apply { this.fileId = fileId }

        /** Alias for calling [Builder.fileId] with `fileId.orElse(null)`. */
        fun fileId(fileId: Optional<String>) = fileId(fileId.getOrNull())

        fun expirationSeconds(expirationSeconds: Long?) = apply {
            this.expirationSeconds = expirationSeconds
        }

        /**
         * Alias for [Builder.expirationSeconds].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun expirationSeconds(expirationSeconds: Long) =
            expirationSeconds(expirationSeconds as Long?)

        /** Alias for calling [Builder.expirationSeconds] with `expirationSeconds.orElse(null)`. */
        fun expirationSeconds(expirationSeconds: Optional<Long>) =
            expirationSeconds(expirationSeconds.getOrNull())

        fun size(size: Size?) = apply { this.size = size }

        /** Alias for calling [Builder.size] with `size.orElse(null)`. */
        fun size(size: Optional<Size>) = size(size.getOrNull())

        fun upscale(upscale: Boolean?) = apply { this.upscale = upscale }

        /**
         * Alias for [Builder.upscale].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun upscale(upscale: Boolean) = upscale(upscale as Boolean?)

        /** Alias for calling [Builder.upscale] with `upscale.orElse(null)`. */
        fun upscale(upscale: Optional<Boolean>) = upscale(upscale.getOrNull())

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
         * Returns an immutable instance of [FileAssetGetSignedUrlParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FileAssetGetSignedUrlParams =
            FileAssetGetSignedUrlParams(
                fileId,
                expirationSeconds,
                size,
                upscale,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> fileId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                expirationSeconds?.let { put("expirationSeconds", it.toString()) }
                size?.let { put("size", it.toString()) }
                upscale?.let { put("upscale", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class Size @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ICON = of("icon")

            @JvmField val MEDIUM = of("medium")

            @JvmField val PREVIEW = of("preview")

            @JvmField val THUMB = of("thumb")

            @JvmStatic fun of(value: String) = Size(JsonField.of(value))
        }

        /** An enum containing [Size]'s known values. */
        enum class Known {
            ICON,
            MEDIUM,
            PREVIEW,
            THUMB,
        }

        /**
         * An enum containing [Size]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Size] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ICON,
            MEDIUM,
            PREVIEW,
            THUMB,
            /** An enum member indicating that [Size] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ICON -> Value.ICON
                MEDIUM -> Value.MEDIUM
                PREVIEW -> Value.PREVIEW
                THUMB -> Value.THUMB
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ICON -> Known.ICON
                MEDIUM -> Known.MEDIUM
                PREVIEW -> Known.PREVIEW
                THUMB -> Known.THUMB
                else -> throw HubSpotInvalidDataException("Unknown Size: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Size = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HubSpotInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Size && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileAssetGetSignedUrlParams &&
            fileId == other.fileId &&
            expirationSeconds == other.expirationSeconds &&
            size == other.size &&
            upscale == other.upscale &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            fileId,
            expirationSeconds,
            size,
            upscale,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FileAssetGetSignedUrlParams{fileId=$fileId, expirationSeconds=$expirationSeconds, size=$size, upscale=$upscale, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
