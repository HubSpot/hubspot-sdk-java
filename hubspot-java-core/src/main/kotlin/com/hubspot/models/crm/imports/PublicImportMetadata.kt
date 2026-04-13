// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.imports

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkKnown
import com.hubspot.core.checkRequired
import com.hubspot.core.toImmutable
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PublicImportMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val counters: JsonField<Counters>,
    private val fileIds: JsonField<List<String>>,
    private val objectLists: JsonField<List<PublicObjectListRecord>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("counters") @ExcludeMissing counters: JsonField<Counters> = JsonMissing.of(),
        @JsonProperty("fileIds")
        @ExcludeMissing
        fileIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("objectLists")
        @ExcludeMissing
        objectLists: JsonField<List<PublicObjectListRecord>> = JsonMissing.of(),
    ) : this(counters, fileIds, objectLists, mutableMapOf())

    /**
     * Summarized outcomes of each row a developer attempted to import into HubSpot.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun counters(): Counters = counters.getRequired("counters")

    /**
     * The IDs of files uploaded in the File Manager API.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileIds(): List<String> = fileIds.getRequired("fileIds")

    /**
     * The lists containing the imported objects.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectLists(): List<PublicObjectListRecord> = objectLists.getRequired("objectLists")

    /**
     * Returns the raw JSON value of [counters].
     *
     * Unlike [counters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("counters") @ExcludeMissing fun _counters(): JsonField<Counters> = counters

    /**
     * Returns the raw JSON value of [fileIds].
     *
     * Unlike [fileIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fileIds") @ExcludeMissing fun _fileIds(): JsonField<List<String>> = fileIds

    /**
     * Returns the raw JSON value of [objectLists].
     *
     * Unlike [objectLists], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectLists")
    @ExcludeMissing
    fun _objectLists(): JsonField<List<PublicObjectListRecord>> = objectLists

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

        /**
         * Returns a mutable builder for constructing an instance of [PublicImportMetadata].
         *
         * The following fields are required:
         * ```java
         * .counters()
         * .fileIds()
         * .objectLists()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicImportMetadata]. */
    class Builder internal constructor() {

        private var counters: JsonField<Counters>? = null
        private var fileIds: JsonField<MutableList<String>>? = null
        private var objectLists: JsonField<MutableList<PublicObjectListRecord>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicImportMetadata: PublicImportMetadata) = apply {
            counters = publicImportMetadata.counters
            fileIds = publicImportMetadata.fileIds.map { it.toMutableList() }
            objectLists = publicImportMetadata.objectLists.map { it.toMutableList() }
            additionalProperties = publicImportMetadata.additionalProperties.toMutableMap()
        }

        /** Summarized outcomes of each row a developer attempted to import into HubSpot. */
        fun counters(counters: Counters) = counters(JsonField.of(counters))

        /**
         * Sets [Builder.counters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counters] with a well-typed [Counters] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun counters(counters: JsonField<Counters>) = apply { this.counters = counters }

        /** The IDs of files uploaded in the File Manager API. */
        fun fileIds(fileIds: List<String>) = fileIds(JsonField.of(fileIds))

        /**
         * Sets [Builder.fileIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fileIds(fileIds: JsonField<List<String>>) = apply {
            this.fileIds = fileIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [fileIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFileId(fileId: String) = apply {
            fileIds =
                (fileIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fileIds", it).add(fileId)
                }
        }

        /** The lists containing the imported objects. */
        fun objectLists(objectLists: List<PublicObjectListRecord>) =
            objectLists(JsonField.of(objectLists))

        /**
         * Sets [Builder.objectLists] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectLists] with a well-typed
         * `List<PublicObjectListRecord>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun objectLists(objectLists: JsonField<List<PublicObjectListRecord>>) = apply {
            this.objectLists = objectLists.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicObjectListRecord] to [objectLists].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObjectList(objectList: PublicObjectListRecord) = apply {
            objectLists =
                (objectLists ?: JsonField.of(mutableListOf())).also {
                    checkKnown("objectLists", it).add(objectList)
                }
        }

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
         * Returns an immutable instance of [PublicImportMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .counters()
         * .fileIds()
         * .objectLists()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicImportMetadata =
            PublicImportMetadata(
                checkRequired("counters", counters),
                checkRequired("fileIds", fileIds).map { it.toImmutable() },
                checkRequired("objectLists", objectLists).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicImportMetadata = apply {
        if (validated) {
            return@apply
        }

        counters().validate()
        fileIds()
        objectLists().forEach { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (counters.asKnown().getOrNull()?.validity() ?: 0) +
            (fileIds.asKnown().getOrNull()?.size ?: 0) +
            (objectLists.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** Summarized outcomes of each row a developer attempted to import into HubSpot. */
    class Counters
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Counters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Counters]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(counters: Counters) = apply {
                additionalProperties = counters.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [Counters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Counters = Counters(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Counters = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Counters && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Counters{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicImportMetadata &&
            counters == other.counters &&
            fileIds == other.fileIds &&
            objectLists == other.objectLists &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(counters, fileIds, objectLists, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicImportMetadata{counters=$counters, fileIds=$fileIds, objectLists=$objectLists, additionalProperties=$additionalProperties}"
}
