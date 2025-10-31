// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.BaseDeserializer
import com.hubspot_sdk.api.core.BaseSerializer
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.allMaxBy
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import com.hubspot_sdk.api.models.ForwardPaging
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CollectionResponsePublicMessageForwardPaging
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val results: JsonField<List<Result>>,
    private val paging: JsonField<ForwardPaging>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("results")
        @ExcludeMissing
        results: JsonField<List<Result>> = JsonMissing.of(),
        @JsonProperty("paging") @ExcludeMissing paging: JsonField<ForwardPaging> = JsonMissing.of(),
    ) : this(results, paging, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun results(): List<Result> = results.getRequired("results")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paging(): Optional<ForwardPaging> = paging.getOptional("paging")

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

    /**
     * Returns the raw JSON value of [paging].
     *
     * Unlike [paging], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paging") @ExcludeMissing fun _paging(): JsonField<ForwardPaging> = paging

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
         * Returns a mutable builder for constructing an instance of
         * [CollectionResponsePublicMessageForwardPaging].
         *
         * The following fields are required:
         * ```java
         * .results()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CollectionResponsePublicMessageForwardPaging]. */
    class Builder internal constructor() {

        private var results: JsonField<MutableList<Result>>? = null
        private var paging: JsonField<ForwardPaging> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            collectionResponsePublicMessageForwardPaging:
                CollectionResponsePublicMessageForwardPaging
        ) = apply {
            results =
                collectionResponsePublicMessageForwardPaging.results.map { it.toMutableList() }
            paging = collectionResponsePublicMessageForwardPaging.paging
            additionalProperties =
                collectionResponsePublicMessageForwardPaging.additionalProperties.toMutableMap()
        }

        fun results(results: List<Result>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<Result>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun results(results: JsonField<List<Result>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [Result] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: Result) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
                }
        }

        /**
         * Alias for calling [addResult] with
         * `Result.ofPublicConversationsMessage(publicConversationsMessage)`.
         */
        fun addResult(publicConversationsMessage: PublicConversationsMessage) =
            addResult(Result.ofPublicConversationsMessage(publicConversationsMessage))

        /** Alias for calling [addResult] with `Result.ofPublicComment(publicComment)`. */
        fun addResult(publicComment: PublicComment) =
            addResult(Result.ofPublicComment(publicComment))

        /**
         * Alias for calling [addResult] with `Result.ofPublicWelcomeMessage(publicWelcomeMessage)`.
         */
        fun addResult(publicWelcomeMessage: PublicWelcomeMessage) =
            addResult(Result.ofPublicWelcomeMessage(publicWelcomeMessage))

        /**
         * Alias for calling [addResult] with
         * `Result.ofPublicAssignmentMessage(publicAssignmentMessage)`.
         */
        fun addResult(publicAssignmentMessage: PublicAssignmentMessage) =
            addResult(Result.ofPublicAssignmentMessage(publicAssignmentMessage))

        /**
         * Alias for calling [addResult] with
         * `Result.ofPublicThreadStatusChange(publicThreadStatusChange)`.
         */
        fun addResult(publicThreadStatusChange: PublicThreadStatusChange) =
            addResult(Result.ofPublicThreadStatusChange(publicThreadStatusChange))

        /**
         * Alias for calling [addResult] with
         * `Result.ofPublicThreadInboxChange(publicThreadInboxChange)`.
         */
        fun addResult(publicThreadInboxChange: PublicThreadInboxChange) =
            addResult(Result.ofPublicThreadInboxChange(publicThreadInboxChange))

        fun paging(paging: ForwardPaging) = paging(JsonField.of(paging))

        /**
         * Sets [Builder.paging] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paging] with a well-typed [ForwardPaging] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paging(paging: JsonField<ForwardPaging>) = apply { this.paging = paging }

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
         * Returns an immutable instance of [CollectionResponsePublicMessageForwardPaging].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .results()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CollectionResponsePublicMessageForwardPaging =
            CollectionResponsePublicMessageForwardPaging(
                checkRequired("results", results).map { it.toImmutable() },
                paging,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CollectionResponsePublicMessageForwardPaging = apply {
        if (validated) {
            return@apply
        }

        results().forEach { it.validate() }
        paging().ifPresent { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: HubspotInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (paging.asKnown().getOrNull()?.validity() ?: 0)

    @JsonDeserialize(using = Result.Deserializer::class)
    @JsonSerialize(using = Result.Serializer::class)
    class Result
    private constructor(
        private val publicConversationsMessage: PublicConversationsMessage? = null,
        private val publicComment: PublicComment? = null,
        private val publicWelcomeMessage: PublicWelcomeMessage? = null,
        private val publicAssignmentMessage: PublicAssignmentMessage? = null,
        private val publicThreadStatusChange: PublicThreadStatusChange? = null,
        private val publicThreadInboxChange: PublicThreadInboxChange? = null,
        private val _json: JsonValue? = null,
    ) {

        fun publicConversationsMessage(): Optional<PublicConversationsMessage> =
            Optional.ofNullable(publicConversationsMessage)

        fun publicComment(): Optional<PublicComment> = Optional.ofNullable(publicComment)

        fun publicWelcomeMessage(): Optional<PublicWelcomeMessage> =
            Optional.ofNullable(publicWelcomeMessage)

        fun publicAssignmentMessage(): Optional<PublicAssignmentMessage> =
            Optional.ofNullable(publicAssignmentMessage)

        fun publicThreadStatusChange(): Optional<PublicThreadStatusChange> =
            Optional.ofNullable(publicThreadStatusChange)

        fun publicThreadInboxChange(): Optional<PublicThreadInboxChange> =
            Optional.ofNullable(publicThreadInboxChange)

        fun isPublicConversationsMessage(): Boolean = publicConversationsMessage != null

        fun isPublicComment(): Boolean = publicComment != null

        fun isPublicWelcomeMessage(): Boolean = publicWelcomeMessage != null

        fun isPublicAssignmentMessage(): Boolean = publicAssignmentMessage != null

        fun isPublicThreadStatusChange(): Boolean = publicThreadStatusChange != null

        fun isPublicThreadInboxChange(): Boolean = publicThreadInboxChange != null

        fun asPublicConversationsMessage(): PublicConversationsMessage =
            publicConversationsMessage.getOrThrow("publicConversationsMessage")

        fun asPublicComment(): PublicComment = publicComment.getOrThrow("publicComment")

        fun asPublicWelcomeMessage(): PublicWelcomeMessage =
            publicWelcomeMessage.getOrThrow("publicWelcomeMessage")

        fun asPublicAssignmentMessage(): PublicAssignmentMessage =
            publicAssignmentMessage.getOrThrow("publicAssignmentMessage")

        fun asPublicThreadStatusChange(): PublicThreadStatusChange =
            publicThreadStatusChange.getOrThrow("publicThreadStatusChange")

        fun asPublicThreadInboxChange(): PublicThreadInboxChange =
            publicThreadInboxChange.getOrThrow("publicThreadInboxChange")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                publicConversationsMessage != null ->
                    visitor.visitPublicConversationsMessage(publicConversationsMessage)
                publicComment != null -> visitor.visitPublicComment(publicComment)
                publicWelcomeMessage != null ->
                    visitor.visitPublicWelcomeMessage(publicWelcomeMessage)
                publicAssignmentMessage != null ->
                    visitor.visitPublicAssignmentMessage(publicAssignmentMessage)
                publicThreadStatusChange != null ->
                    visitor.visitPublicThreadStatusChange(publicThreadStatusChange)
                publicThreadInboxChange != null ->
                    visitor.visitPublicThreadInboxChange(publicThreadInboxChange)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPublicConversationsMessage(
                        publicConversationsMessage: PublicConversationsMessage
                    ) {
                        publicConversationsMessage.validate()
                    }

                    override fun visitPublicComment(publicComment: PublicComment) {
                        publicComment.validate()
                    }

                    override fun visitPublicWelcomeMessage(
                        publicWelcomeMessage: PublicWelcomeMessage
                    ) {
                        publicWelcomeMessage.validate()
                    }

                    override fun visitPublicAssignmentMessage(
                        publicAssignmentMessage: PublicAssignmentMessage
                    ) {
                        publicAssignmentMessage.validate()
                    }

                    override fun visitPublicThreadStatusChange(
                        publicThreadStatusChange: PublicThreadStatusChange
                    ) {
                        publicThreadStatusChange.validate()
                    }

                    override fun visitPublicThreadInboxChange(
                        publicThreadInboxChange: PublicThreadInboxChange
                    ) {
                        publicThreadInboxChange.validate()
                    }
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HubspotInvalidDataException) {
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
            accept(
                object : Visitor<Int> {
                    override fun visitPublicConversationsMessage(
                        publicConversationsMessage: PublicConversationsMessage
                    ) = publicConversationsMessage.validity()

                    override fun visitPublicComment(publicComment: PublicComment) =
                        publicComment.validity()

                    override fun visitPublicWelcomeMessage(
                        publicWelcomeMessage: PublicWelcomeMessage
                    ) = publicWelcomeMessage.validity()

                    override fun visitPublicAssignmentMessage(
                        publicAssignmentMessage: PublicAssignmentMessage
                    ) = publicAssignmentMessage.validity()

                    override fun visitPublicThreadStatusChange(
                        publicThreadStatusChange: PublicThreadStatusChange
                    ) = publicThreadStatusChange.validity()

                    override fun visitPublicThreadInboxChange(
                        publicThreadInboxChange: PublicThreadInboxChange
                    ) = publicThreadInboxChange.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                publicConversationsMessage == other.publicConversationsMessage &&
                publicComment == other.publicComment &&
                publicWelcomeMessage == other.publicWelcomeMessage &&
                publicAssignmentMessage == other.publicAssignmentMessage &&
                publicThreadStatusChange == other.publicThreadStatusChange &&
                publicThreadInboxChange == other.publicThreadInboxChange
        }

        override fun hashCode(): Int =
            Objects.hash(
                publicConversationsMessage,
                publicComment,
                publicWelcomeMessage,
                publicAssignmentMessage,
                publicThreadStatusChange,
                publicThreadInboxChange,
            )

        override fun toString(): String =
            when {
                publicConversationsMessage != null ->
                    "Result{publicConversationsMessage=$publicConversationsMessage}"
                publicComment != null -> "Result{publicComment=$publicComment}"
                publicWelcomeMessage != null -> "Result{publicWelcomeMessage=$publicWelcomeMessage}"
                publicAssignmentMessage != null ->
                    "Result{publicAssignmentMessage=$publicAssignmentMessage}"
                publicThreadStatusChange != null ->
                    "Result{publicThreadStatusChange=$publicThreadStatusChange}"
                publicThreadInboxChange != null ->
                    "Result{publicThreadInboxChange=$publicThreadInboxChange}"
                _json != null -> "Result{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Result")
            }

        companion object {

            @JvmStatic
            fun ofPublicConversationsMessage(
                publicConversationsMessage: PublicConversationsMessage
            ) = Result(publicConversationsMessage = publicConversationsMessage)

            @JvmStatic
            fun ofPublicComment(publicComment: PublicComment) =
                Result(publicComment = publicComment)

            @JvmStatic
            fun ofPublicWelcomeMessage(publicWelcomeMessage: PublicWelcomeMessage) =
                Result(publicWelcomeMessage = publicWelcomeMessage)

            @JvmStatic
            fun ofPublicAssignmentMessage(publicAssignmentMessage: PublicAssignmentMessage) =
                Result(publicAssignmentMessage = publicAssignmentMessage)

            @JvmStatic
            fun ofPublicThreadStatusChange(publicThreadStatusChange: PublicThreadStatusChange) =
                Result(publicThreadStatusChange = publicThreadStatusChange)

            @JvmStatic
            fun ofPublicThreadInboxChange(publicThreadInboxChange: PublicThreadInboxChange) =
                Result(publicThreadInboxChange = publicThreadInboxChange)
        }

        /** An interface that defines how to map each variant of [Result] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitPublicConversationsMessage(
                publicConversationsMessage: PublicConversationsMessage
            ): T

            fun visitPublicComment(publicComment: PublicComment): T

            fun visitPublicWelcomeMessage(publicWelcomeMessage: PublicWelcomeMessage): T

            fun visitPublicAssignmentMessage(publicAssignmentMessage: PublicAssignmentMessage): T

            fun visitPublicThreadStatusChange(publicThreadStatusChange: PublicThreadStatusChange): T

            fun visitPublicThreadInboxChange(publicThreadInboxChange: PublicThreadInboxChange): T

            /**
             * Maps an unknown variant of [Result] to a value of type [T].
             *
             * An instance of [Result] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown Result: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Result>(Result::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Result {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicConversationsMessage>())
                                ?.let { Result(publicConversationsMessage = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicComment>())?.let {
                                Result(publicComment = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicWelcomeMessage>())?.let {
                                Result(publicWelcomeMessage = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicAssignmentMessage>())?.let {
                                Result(publicAssignmentMessage = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicThreadStatusChange>())?.let {
                                Result(publicThreadStatusChange = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicThreadInboxChange>())?.let {
                                Result(publicThreadInboxChange = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Result(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Result>(Result::class) {

            override fun serialize(
                value: Result,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.publicConversationsMessage != null ->
                        generator.writeObject(value.publicConversationsMessage)
                    value.publicComment != null -> generator.writeObject(value.publicComment)
                    value.publicWelcomeMessage != null ->
                        generator.writeObject(value.publicWelcomeMessage)
                    value.publicAssignmentMessage != null ->
                        generator.writeObject(value.publicAssignmentMessage)
                    value.publicThreadStatusChange != null ->
                        generator.writeObject(value.publicThreadStatusChange)
                    value.publicThreadInboxChange != null ->
                        generator.writeObject(value.publicThreadInboxChange)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Result")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CollectionResponsePublicMessageForwardPaging &&
            results == other.results &&
            paging == other.paging &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(results, paging, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CollectionResponsePublicMessageForwardPaging{results=$results, paging=$paging, additionalProperties=$additionalProperties}"
}
