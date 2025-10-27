// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files.files

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.MultipartField
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.io.path.inputStream
import kotlin.io.path.name

/** Upload a single file with content specified in request body. */
class FileUploadParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Character set of the uploaded file.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun charsetHunch(): Optional<String> = body.charsetHunch()

    /**
     * File to be uploaded.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun file(): Optional<InputStream> = body.file()

    /**
     * Desired name for the uploaded file.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileName(): Optional<String> = body.fileName()

    /**
     * Either 'folderId' or 'folderPath' is required. folderId is the ID of the folder the file will
     * be uploaded to.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folderId(): Optional<String> = body.folderId()

    /**
     * Either 'folderPath' or 'folderId' is required. This field represents the destination folder
     * path for the uploaded file. If a path doesn't exist, the system will try to create one.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folderPath(): Optional<String> = body.folderPath()

    /**
     * JSON string representing FileUploadOptions.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun options(): Optional<String> = body.options()

    /**
     * Returns the raw multipart value of [charsetHunch].
     *
     * Unlike [charsetHunch], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _charsetHunch(): MultipartField<String> = body._charsetHunch()

    /**
     * Returns the raw multipart value of [file].
     *
     * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _file(): MultipartField<InputStream> = body._file()

    /**
     * Returns the raw multipart value of [fileName].
     *
     * Unlike [fileName], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _fileName(): MultipartField<String> = body._fileName()

    /**
     * Returns the raw multipart value of [folderId].
     *
     * Unlike [folderId], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _folderId(): MultipartField<String> = body._folderId()

    /**
     * Returns the raw multipart value of [folderPath].
     *
     * Unlike [folderPath], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _folderPath(): MultipartField<String> = body._folderPath()

    /**
     * Returns the raw multipart value of [options].
     *
     * Unlike [options], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _options(): MultipartField<String> = body._options()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FileUploadParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [FileUploadParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileUploadParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fileUploadParams: FileUploadParams) = apply {
            body = fileUploadParams.body.toBuilder()
            additionalHeaders = fileUploadParams.additionalHeaders.toBuilder()
            additionalQueryParams = fileUploadParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [charsetHunch]
         * - [file]
         * - [fileName]
         * - [folderId]
         * - [folderPath]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Character set of the uploaded file. */
        fun charsetHunch(charsetHunch: String) = apply { body.charsetHunch(charsetHunch) }

        /**
         * Sets [Builder.charsetHunch] to an arbitrary multipart value.
         *
         * You should usually call [Builder.charsetHunch] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun charsetHunch(charsetHunch: MultipartField<String>) = apply {
            body.charsetHunch(charsetHunch)
        }

        /** File to be uploaded. */
        fun file(file: InputStream) = apply { body.file(file) }

        /**
         * Sets [Builder.file] to an arbitrary multipart value.
         *
         * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun file(file: MultipartField<InputStream>) = apply { body.file(file) }

        /** File to be uploaded. */
        fun file(file: ByteArray) = apply { body.file(file) }

        /** File to be uploaded. */
        fun file(path: Path) = apply { body.file(path) }

        /** Desired name for the uploaded file. */
        fun fileName(fileName: String) = apply { body.fileName(fileName) }

        /**
         * Sets [Builder.fileName] to an arbitrary multipart value.
         *
         * You should usually call [Builder.fileName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileName(fileName: MultipartField<String>) = apply { body.fileName(fileName) }

        /**
         * Either 'folderId' or 'folderPath' is required. folderId is the ID of the folder the file
         * will be uploaded to.
         */
        fun folderId(folderId: String) = apply { body.folderId(folderId) }

        /**
         * Sets [Builder.folderId] to an arbitrary multipart value.
         *
         * You should usually call [Builder.folderId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun folderId(folderId: MultipartField<String>) = apply { body.folderId(folderId) }

        /**
         * Either 'folderPath' or 'folderId' is required. This field represents the destination
         * folder path for the uploaded file. If a path doesn't exist, the system will try to create
         * one.
         */
        fun folderPath(folderPath: String) = apply { body.folderPath(folderPath) }

        /**
         * Sets [Builder.folderPath] to an arbitrary multipart value.
         *
         * You should usually call [Builder.folderPath] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun folderPath(folderPath: MultipartField<String>) = apply { body.folderPath(folderPath) }

        /** JSON string representing FileUploadOptions. */
        fun options(options: String) = apply { body.options(options) }

        /**
         * Sets [Builder.options] to an arbitrary multipart value.
         *
         * You should usually call [Builder.options] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun options(options: MultipartField<String>) = apply { body.options(options) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [FileUploadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FileUploadParams =
            FileUploadParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "charsetHunch" to _charsetHunch(),
                "file" to _file(),
                "fileName" to _fileName(),
                "folderId" to _folderId(),
                "folderPath" to _folderPath(),
                "options" to _options(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val charsetHunch: MultipartField<String>,
        private val file: MultipartField<InputStream>,
        private val fileName: MultipartField<String>,
        private val folderId: MultipartField<String>,
        private val folderPath: MultipartField<String>,
        private val options: MultipartField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * Character set of the uploaded file.
         *
         * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun charsetHunch(): Optional<String> = charsetHunch.value.getOptional("charsetHunch")

        /**
         * File to be uploaded.
         *
         * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun file(): Optional<InputStream> = file.value.getOptional("file")

        /**
         * Desired name for the uploaded file.
         *
         * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fileName(): Optional<String> = fileName.value.getOptional("fileName")

        /**
         * Either 'folderId' or 'folderPath' is required. folderId is the ID of the folder the file
         * will be uploaded to.
         *
         * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun folderId(): Optional<String> = folderId.value.getOptional("folderId")

        /**
         * Either 'folderPath' or 'folderId' is required. This field represents the destination
         * folder path for the uploaded file. If a path doesn't exist, the system will try to create
         * one.
         *
         * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun folderPath(): Optional<String> = folderPath.value.getOptional("folderPath")

        /**
         * JSON string representing FileUploadOptions.
         *
         * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun options(): Optional<String> = options.value.getOptional("options")

        /**
         * Returns the raw multipart value of [charsetHunch].
         *
         * Unlike [charsetHunch], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("charsetHunch")
        @ExcludeMissing
        fun _charsetHunch(): MultipartField<String> = charsetHunch

        /**
         * Returns the raw multipart value of [file].
         *
         * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("file") @ExcludeMissing fun _file(): MultipartField<InputStream> = file

        /**
         * Returns the raw multipart value of [fileName].
         *
         * Unlike [fileName], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("fileName") @ExcludeMissing fun _fileName(): MultipartField<String> = fileName

        /**
         * Returns the raw multipart value of [folderId].
         *
         * Unlike [folderId], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("folderId") @ExcludeMissing fun _folderId(): MultipartField<String> = folderId

        /**
         * Returns the raw multipart value of [folderPath].
         *
         * Unlike [folderPath], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("folderPath")
        @ExcludeMissing
        fun _folderPath(): MultipartField<String> = folderPath

        /**
         * Returns the raw multipart value of [options].
         *
         * Unlike [options], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("options") @ExcludeMissing fun _options(): MultipartField<String> = options

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var charsetHunch: MultipartField<String> = MultipartField.of(null)
            private var file: MultipartField<InputStream> = MultipartField.of(null)
            private var fileName: MultipartField<String> = MultipartField.of(null)
            private var folderId: MultipartField<String> = MultipartField.of(null)
            private var folderPath: MultipartField<String> = MultipartField.of(null)
            private var options: MultipartField<String> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                charsetHunch = body.charsetHunch
                file = body.file
                fileName = body.fileName
                folderId = body.folderId
                folderPath = body.folderPath
                options = body.options
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Character set of the uploaded file. */
            fun charsetHunch(charsetHunch: String) = charsetHunch(MultipartField.of(charsetHunch))

            /**
             * Sets [Builder.charsetHunch] to an arbitrary multipart value.
             *
             * You should usually call [Builder.charsetHunch] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun charsetHunch(charsetHunch: MultipartField<String>) = apply {
                this.charsetHunch = charsetHunch
            }

            /** File to be uploaded. */
            fun file(file: InputStream) = file(MultipartField.of(file))

            /**
             * Sets [Builder.file] to an arbitrary multipart value.
             *
             * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun file(file: MultipartField<InputStream>) = apply { this.file = file }

            /** File to be uploaded. */
            fun file(file: ByteArray) = file(file.inputStream())

            /** File to be uploaded. */
            fun file(path: Path) =
                file(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** Desired name for the uploaded file. */
            fun fileName(fileName: String) = fileName(MultipartField.of(fileName))

            /**
             * Sets [Builder.fileName] to an arbitrary multipart value.
             *
             * You should usually call [Builder.fileName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileName(fileName: MultipartField<String>) = apply { this.fileName = fileName }

            /**
             * Either 'folderId' or 'folderPath' is required. folderId is the ID of the folder the
             * file will be uploaded to.
             */
            fun folderId(folderId: String) = folderId(MultipartField.of(folderId))

            /**
             * Sets [Builder.folderId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.folderId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun folderId(folderId: MultipartField<String>) = apply { this.folderId = folderId }

            /**
             * Either 'folderPath' or 'folderId' is required. This field represents the destination
             * folder path for the uploaded file. If a path doesn't exist, the system will try to
             * create one.
             */
            fun folderPath(folderPath: String) = folderPath(MultipartField.of(folderPath))

            /**
             * Sets [Builder.folderPath] to an arbitrary multipart value.
             *
             * You should usually call [Builder.folderPath] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun folderPath(folderPath: MultipartField<String>) = apply {
                this.folderPath = folderPath
            }

            /** JSON string representing FileUploadOptions. */
            fun options(options: String) = options(MultipartField.of(options))

            /**
             * Sets [Builder.options] to an arbitrary multipart value.
             *
             * You should usually call [Builder.options] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun options(options: MultipartField<String>) = apply { this.options = options }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    charsetHunch,
                    file,
                    fileName,
                    folderId,
                    folderPath,
                    options,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            charsetHunch()
            file()
            fileName()
            folderId()
            folderPath()
            options()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HubSpotInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                charsetHunch == other.charsetHunch &&
                file == other.file &&
                fileName == other.fileName &&
                folderId == other.folderId &&
                folderPath == other.folderPath &&
                options == other.options &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                charsetHunch,
                file,
                fileName,
                folderId,
                folderPath,
                options,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{charsetHunch=$charsetHunch, file=$file, fileName=$fileName, folderId=$folderId, folderPath=$folderPath, options=$options, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileUploadParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FileUploadParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
