// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

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

class PublicBatchMigrationMapping
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val legacyListIdsToIdsMapping: JsonField<List<PublicMigrationMapping>>,
    private val missingLegacyListIds: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("legacyListIdsToIdsMapping")
        @ExcludeMissing
        legacyListIdsToIdsMapping: JsonField<List<PublicMigrationMapping>> = JsonMissing.of(),
        @JsonProperty("missingLegacyListIds")
        @ExcludeMissing
        missingLegacyListIds: JsonField<List<String>> = JsonMissing.of(),
    ) : this(legacyListIdsToIdsMapping, missingLegacyListIds, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legacyListIdsToIdsMapping(): List<PublicMigrationMapping> =
        legacyListIdsToIdsMapping.getRequired("legacyListIdsToIdsMapping")

    /**
     * A list of legacy list ids that were passed in but not found. It will be empty if no id's are
     * missing
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun missingLegacyListIds(): List<String> =
        missingLegacyListIds.getRequired("missingLegacyListIds")

    /**
     * Returns the raw JSON value of [legacyListIdsToIdsMapping].
     *
     * Unlike [legacyListIdsToIdsMapping], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("legacyListIdsToIdsMapping")
    @ExcludeMissing
    fun _legacyListIdsToIdsMapping(): JsonField<List<PublicMigrationMapping>> =
        legacyListIdsToIdsMapping

    /**
     * Returns the raw JSON value of [missingLegacyListIds].
     *
     * Unlike [missingLegacyListIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("missingLegacyListIds")
    @ExcludeMissing
    fun _missingLegacyListIds(): JsonField<List<String>> = missingLegacyListIds

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
         * Returns a mutable builder for constructing an instance of [PublicBatchMigrationMapping].
         *
         * The following fields are required:
         * ```java
         * .legacyListIdsToIdsMapping()
         * .missingLegacyListIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicBatchMigrationMapping]. */
    class Builder internal constructor() {

        private var legacyListIdsToIdsMapping: JsonField<MutableList<PublicMigrationMapping>>? =
            null
        private var missingLegacyListIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicBatchMigrationMapping: PublicBatchMigrationMapping) = apply {
            legacyListIdsToIdsMapping =
                publicBatchMigrationMapping.legacyListIdsToIdsMapping.map { it.toMutableList() }
            missingLegacyListIds =
                publicBatchMigrationMapping.missingLegacyListIds.map { it.toMutableList() }
            additionalProperties = publicBatchMigrationMapping.additionalProperties.toMutableMap()
        }

        fun legacyListIdsToIdsMapping(legacyListIdsToIdsMapping: List<PublicMigrationMapping>) =
            legacyListIdsToIdsMapping(JsonField.of(legacyListIdsToIdsMapping))

        /**
         * Sets [Builder.legacyListIdsToIdsMapping] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legacyListIdsToIdsMapping] with a well-typed
         * `List<PublicMigrationMapping>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun legacyListIdsToIdsMapping(
            legacyListIdsToIdsMapping: JsonField<List<PublicMigrationMapping>>
        ) = apply {
            this.legacyListIdsToIdsMapping = legacyListIdsToIdsMapping.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicMigrationMapping] to [Builder.legacyListIdsToIdsMapping].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLegacyListIdsToIdsMapping(legacyListIdsToIdsMapping: PublicMigrationMapping) =
            apply {
                this.legacyListIdsToIdsMapping =
                    (this.legacyListIdsToIdsMapping ?: JsonField.of(mutableListOf())).also {
                        checkKnown("legacyListIdsToIdsMapping", it).add(legacyListIdsToIdsMapping)
                    }
            }

        /**
         * A list of legacy list ids that were passed in but not found. It will be empty if no id's
         * are missing
         */
        fun missingLegacyListIds(missingLegacyListIds: List<String>) =
            missingLegacyListIds(JsonField.of(missingLegacyListIds))

        /**
         * Sets [Builder.missingLegacyListIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.missingLegacyListIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun missingLegacyListIds(missingLegacyListIds: JsonField<List<String>>) = apply {
            this.missingLegacyListIds = missingLegacyListIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [missingLegacyListIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMissingLegacyListId(missingLegacyListId: String) = apply {
            missingLegacyListIds =
                (missingLegacyListIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("missingLegacyListIds", it).add(missingLegacyListId)
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
         * Returns an immutable instance of [PublicBatchMigrationMapping].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .legacyListIdsToIdsMapping()
         * .missingLegacyListIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicBatchMigrationMapping =
            PublicBatchMigrationMapping(
                checkRequired("legacyListIdsToIdsMapping", legacyListIdsToIdsMapping).map {
                    it.toImmutable()
                },
                checkRequired("missingLegacyListIds", missingLegacyListIds).map {
                    it.toImmutable()
                },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicBatchMigrationMapping = apply {
        if (validated) {
            return@apply
        }

        legacyListIdsToIdsMapping().forEach { it.validate() }
        missingLegacyListIds()
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
        (legacyListIdsToIdsMapping.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (missingLegacyListIds.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicBatchMigrationMapping &&
            legacyListIdsToIdsMapping == other.legacyListIdsToIdsMapping &&
            missingLegacyListIds == other.missingLegacyListIds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(legacyListIdsToIdsMapping, missingLegacyListIds, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicBatchMigrationMapping{legacyListIdsToIdsMapping=$legacyListIdsToIdsMapping, missingLegacyListIds=$missingLegacyListIds, additionalProperties=$additionalProperties}"
}
