// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A JSON object containing anything you want to override. */
class PublicSingleSendEmail
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val to: JsonField<String>,
    private val bcc: JsonField<List<String>>,
    private val cc: JsonField<List<String>>,
    private val from: JsonField<String>,
    private val replyTo: JsonField<List<String>>,
    private val sendId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bcc") @ExcludeMissing bcc: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("cc") @ExcludeMissing cc: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
        @JsonProperty("replyTo")
        @ExcludeMissing
        replyTo: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("sendId") @ExcludeMissing sendId: JsonField<String> = JsonMissing.of(),
    ) : this(to, bcc, cc, from, replyTo, sendId, mutableMapOf())

    /**
     * The recipient of the email.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): String = to.getRequired("to")

    /**
     * List of email addresses to send as Bcc.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bcc(): Optional<List<String>> = bcc.getOptional("bcc")

    /**
     * List of email addresses to send as Cc.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cc(): Optional<List<String>> = cc.getOptional("cc")

    /**
     * The From header for the email.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun from(): Optional<String> = from.getOptional("from")

    /**
     * List of Reply-To header values for the email.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replyTo(): Optional<List<String>> = replyTo.getOptional("replyTo")

    /**
     * ID for a particular send. No more than one email will be sent per sendId.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sendId(): Optional<String> = sendId.getOptional("sendId")

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

    /**
     * Returns the raw JSON value of [bcc].
     *
     * Unlike [bcc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bcc") @ExcludeMissing fun _bcc(): JsonField<List<String>> = bcc

    /**
     * Returns the raw JSON value of [cc].
     *
     * Unlike [cc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cc") @ExcludeMissing fun _cc(): JsonField<List<String>> = cc

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

    /**
     * Returns the raw JSON value of [replyTo].
     *
     * Unlike [replyTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("replyTo") @ExcludeMissing fun _replyTo(): JsonField<List<String>> = replyTo

    /**
     * Returns the raw JSON value of [sendId].
     *
     * Unlike [sendId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sendId") @ExcludeMissing fun _sendId(): JsonField<String> = sendId

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
         * Returns a mutable builder for constructing an instance of [PublicSingleSendEmail].
         *
         * The following fields are required:
         * ```java
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicSingleSendEmail]. */
    class Builder internal constructor() {

        private var to: JsonField<String>? = null
        private var bcc: JsonField<MutableList<String>>? = null
        private var cc: JsonField<MutableList<String>>? = null
        private var from: JsonField<String> = JsonMissing.of()
        private var replyTo: JsonField<MutableList<String>>? = null
        private var sendId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicSingleSendEmail: PublicSingleSendEmail) = apply {
            to = publicSingleSendEmail.to
            bcc = publicSingleSendEmail.bcc.map { it.toMutableList() }
            cc = publicSingleSendEmail.cc.map { it.toMutableList() }
            from = publicSingleSendEmail.from
            replyTo = publicSingleSendEmail.replyTo.map { it.toMutableList() }
            sendId = publicSingleSendEmail.sendId
            additionalProperties = publicSingleSendEmail.additionalProperties.toMutableMap()
        }

        /** The recipient of the email. */
        fun to(to: String) = to(JsonField.of(to))

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<String>) = apply { this.to = to }

        /** List of email addresses to send as Bcc. */
        fun bcc(bcc: List<String>) = bcc(JsonField.of(bcc))

        /**
         * Sets [Builder.bcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bcc] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bcc(bcc: JsonField<List<String>>) = apply { this.bcc = bcc.map { it.toMutableList() } }

        /**
         * Adds a single [String] to [Builder.bcc].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBcc(bcc: String) = apply {
            this.bcc =
                (this.bcc ?: JsonField.of(mutableListOf())).also { checkKnown("bcc", it).add(bcc) }
        }

        /** List of email addresses to send as Cc. */
        fun cc(cc: List<String>) = cc(JsonField.of(cc))

        /**
         * Sets [Builder.cc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cc] with a well-typed `List<String>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cc(cc: JsonField<List<String>>) = apply { this.cc = cc.map { it.toMutableList() } }

        /**
         * Adds a single [String] to [Builder.cc].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCc(cc: String) = apply {
            this.cc =
                (this.cc ?: JsonField.of(mutableListOf())).also { checkKnown("cc", it).add(cc) }
        }

        /** The From header for the email. */
        fun from(from: String) = from(JsonField.of(from))

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<String>) = apply { this.from = from }

        /** List of Reply-To header values for the email. */
        fun replyTo(replyTo: List<String>) = replyTo(JsonField.of(replyTo))

        /**
         * Sets [Builder.replyTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replyTo] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun replyTo(replyTo: JsonField<List<String>>) = apply {
            this.replyTo = replyTo.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.replyTo].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReplyTo(replyTo: String) = apply {
            this.replyTo =
                (this.replyTo ?: JsonField.of(mutableListOf())).also {
                    checkKnown("replyTo", it).add(replyTo)
                }
        }

        /** ID for a particular send. No more than one email will be sent per sendId. */
        fun sendId(sendId: String) = sendId(JsonField.of(sendId))

        /**
         * Sets [Builder.sendId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sendId(sendId: JsonField<String>) = apply { this.sendId = sendId }

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
         * Returns an immutable instance of [PublicSingleSendEmail].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicSingleSendEmail =
            PublicSingleSendEmail(
                checkRequired("to", to),
                (bcc ?: JsonMissing.of()).map { it.toImmutable() },
                (cc ?: JsonMissing.of()).map { it.toImmutable() },
                from,
                (replyTo ?: JsonMissing.of()).map { it.toImmutable() },
                sendId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicSingleSendEmail = apply {
        if (validated) {
            return@apply
        }

        to()
        bcc()
        cc()
        from()
        replyTo()
        sendId()
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
        (if (to.asKnown().isPresent) 1 else 0) +
            (bcc.asKnown().getOrNull()?.size ?: 0) +
            (cc.asKnown().getOrNull()?.size ?: 0) +
            (if (from.asKnown().isPresent) 1 else 0) +
            (replyTo.asKnown().getOrNull()?.size ?: 0) +
            (if (sendId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicSingleSendEmail &&
            to == other.to &&
            bcc == other.bcc &&
            cc == other.cc &&
            from == other.from &&
            replyTo == other.replyTo &&
            sendId == other.sendId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(to, bcc, cc, from, replyTo, sendId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicSingleSendEmail{to=$to, bcc=$bcc, cc=$cc, from=$from, replyTo=$replyTo, sendId=$sendId, additionalProperties=$additionalProperties}"
}
