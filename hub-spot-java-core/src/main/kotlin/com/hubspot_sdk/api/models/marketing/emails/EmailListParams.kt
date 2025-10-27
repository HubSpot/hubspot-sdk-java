// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.annotation.JsonCreator
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * The results can be filtered, allowing you to find a specific set of emails. See the table below
 * for a full list of filtering options.
 */
class EmailListParams
private constructor(
    private val after: String?,
    private val archived: Boolean?,
    private val campaign: String?,
    private val createdAfter: OffsetDateTime?,
    private val createdAt: OffsetDateTime?,
    private val createdBefore: OffsetDateTime?,
    private val includedProperties: List<String>?,
    private val includeStats: Boolean?,
    private val isPublished: Boolean?,
    private val limit: Int?,
    private val marketingCampaignNames: Boolean?,
    private val sort: List<String>?,
    private val type: Type?,
    private val updatedAfter: OffsetDateTime?,
    private val updatedAt: OffsetDateTime?,
    private val updatedBefore: OffsetDateTime?,
    private val workflowNames: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The cursor token value to get the next set of results. You can get this from the
     * `paging.next.after` JSON property of a paged response containing more results.
     */
    fun after(): Optional<String> = Optional.ofNullable(after)

    /** Specifies whether to return archived emails. Defaults to `false`. */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    /** Filter by campaign GUID. All emails will be returned if not present. */
    fun campaign(): Optional<String> = Optional.ofNullable(campaign)

    /** Only return emails created after the specified time. */
    fun createdAfter(): Optional<OffsetDateTime> = Optional.ofNullable(createdAfter)

    /** Only return emails created at exactly the specified time. */
    fun createdAt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAt)

    /** Only return emails created before the specified time. */
    fun createdBefore(): Optional<OffsetDateTime> = Optional.ofNullable(createdBefore)

    /** Limit the response to only include this specified list of properties. */
    fun includedProperties(): Optional<List<String>> = Optional.ofNullable(includedProperties)

    /** Include statistics with emails. */
    fun includeStats(): Optional<Boolean> = Optional.ofNullable(includeStats)

    /** Filter by published/draft emails. All emails will be returned if not present. */
    fun isPublished(): Optional<Boolean> = Optional.ofNullable(isPublished)

    /** The maximum number of results to return. Default is 10. */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    /** Include the names for any associated marketing campaigns. */
    fun marketingCampaignNames(): Optional<Boolean> = Optional.ofNullable(marketingCampaignNames)

    /**
     * Specifies which fields to use for sorting results. Valid fields are `name`, `createdAt`,
     * `updatedAt`, `createdBy`, `updatedBy`. `createdAt` will be used by default.
     */
    fun sort(): Optional<List<String>> = Optional.ofNullable(sort)

    /**
     * Email types to be filtered by. Multiple types can be included. All emails will be returned if
     * not present.
     */
    fun type(): Optional<Type> = Optional.ofNullable(type)

    /** Only return emails last updated after the specified time. */
    fun updatedAfter(): Optional<OffsetDateTime> = Optional.ofNullable(updatedAfter)

    /** Only return emails last updated at exactly the specified time. */
    fun updatedAt(): Optional<OffsetDateTime> = Optional.ofNullable(updatedAt)

    /** Only return emails last updated before the specified time. */
    fun updatedBefore(): Optional<OffsetDateTime> = Optional.ofNullable(updatedBefore)

    /** Include the names of any workflows associated with the returned emails. */
    fun workflowNames(): Optional<Boolean> = Optional.ofNullable(workflowNames)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EmailListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EmailListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailListParams]. */
    class Builder internal constructor() {

        private var after: String? = null
        private var archived: Boolean? = null
        private var campaign: String? = null
        private var createdAfter: OffsetDateTime? = null
        private var createdAt: OffsetDateTime? = null
        private var createdBefore: OffsetDateTime? = null
        private var includedProperties: MutableList<String>? = null
        private var includeStats: Boolean? = null
        private var isPublished: Boolean? = null
        private var limit: Int? = null
        private var marketingCampaignNames: Boolean? = null
        private var sort: MutableList<String>? = null
        private var type: Type? = null
        private var updatedAfter: OffsetDateTime? = null
        private var updatedAt: OffsetDateTime? = null
        private var updatedBefore: OffsetDateTime? = null
        private var workflowNames: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(emailListParams: EmailListParams) = apply {
            after = emailListParams.after
            archived = emailListParams.archived
            campaign = emailListParams.campaign
            createdAfter = emailListParams.createdAfter
            createdAt = emailListParams.createdAt
            createdBefore = emailListParams.createdBefore
            includedProperties = emailListParams.includedProperties?.toMutableList()
            includeStats = emailListParams.includeStats
            isPublished = emailListParams.isPublished
            limit = emailListParams.limit
            marketingCampaignNames = emailListParams.marketingCampaignNames
            sort = emailListParams.sort?.toMutableList()
            type = emailListParams.type
            updatedAfter = emailListParams.updatedAfter
            updatedAt = emailListParams.updatedAt
            updatedBefore = emailListParams.updatedBefore
            workflowNames = emailListParams.workflowNames
            additionalHeaders = emailListParams.additionalHeaders.toBuilder()
            additionalQueryParams = emailListParams.additionalQueryParams.toBuilder()
        }

        /**
         * The cursor token value to get the next set of results. You can get this from the
         * `paging.next.after` JSON property of a paged response containing more results.
         */
        fun after(after: String?) = apply { this.after = after }

        /** Alias for calling [Builder.after] with `after.orElse(null)`. */
        fun after(after: Optional<String>) = after(after.getOrNull())

        /** Specifies whether to return archived emails. Defaults to `false`. */
        fun archived(archived: Boolean?) = apply { this.archived = archived }

        /**
         * Alias for [Builder.archived].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun archived(archived: Boolean) = archived(archived as Boolean?)

        /** Alias for calling [Builder.archived] with `archived.orElse(null)`. */
        fun archived(archived: Optional<Boolean>) = archived(archived.getOrNull())

        /** Filter by campaign GUID. All emails will be returned if not present. */
        fun campaign(campaign: String?) = apply { this.campaign = campaign }

        /** Alias for calling [Builder.campaign] with `campaign.orElse(null)`. */
        fun campaign(campaign: Optional<String>) = campaign(campaign.getOrNull())

        /** Only return emails created after the specified time. */
        fun createdAfter(createdAfter: OffsetDateTime?) = apply { this.createdAfter = createdAfter }

        /** Alias for calling [Builder.createdAfter] with `createdAfter.orElse(null)`. */
        fun createdAfter(createdAfter: Optional<OffsetDateTime>) =
            createdAfter(createdAfter.getOrNull())

        /** Only return emails created at exactly the specified time. */
        fun createdAt(createdAt: OffsetDateTime?) = apply { this.createdAt = createdAt }

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

        /** Only return emails created before the specified time. */
        fun createdBefore(createdBefore: OffsetDateTime?) = apply {
            this.createdBefore = createdBefore
        }

        /** Alias for calling [Builder.createdBefore] with `createdBefore.orElse(null)`. */
        fun createdBefore(createdBefore: Optional<OffsetDateTime>) =
            createdBefore(createdBefore.getOrNull())

        /** Limit the response to only include this specified list of properties. */
        fun includedProperties(includedProperties: List<String>?) = apply {
            this.includedProperties = includedProperties?.toMutableList()
        }

        /**
         * Alias for calling [Builder.includedProperties] with `includedProperties.orElse(null)`.
         */
        fun includedProperties(includedProperties: Optional<List<String>>) =
            includedProperties(includedProperties.getOrNull())

        /**
         * Adds a single [String] to [includedProperties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIncludedProperty(includedProperty: String) = apply {
            includedProperties =
                (includedProperties ?: mutableListOf()).apply { add(includedProperty) }
        }

        /** Include statistics with emails. */
        fun includeStats(includeStats: Boolean?) = apply { this.includeStats = includeStats }

        /**
         * Alias for [Builder.includeStats].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeStats(includeStats: Boolean) = includeStats(includeStats as Boolean?)

        /** Alias for calling [Builder.includeStats] with `includeStats.orElse(null)`. */
        fun includeStats(includeStats: Optional<Boolean>) = includeStats(includeStats.getOrNull())

        /** Filter by published/draft emails. All emails will be returned if not present. */
        fun isPublished(isPublished: Boolean?) = apply { this.isPublished = isPublished }

        /**
         * Alias for [Builder.isPublished].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isPublished(isPublished: Boolean) = isPublished(isPublished as Boolean?)

        /** Alias for calling [Builder.isPublished] with `isPublished.orElse(null)`. */
        fun isPublished(isPublished: Optional<Boolean>) = isPublished(isPublished.getOrNull())

        /** The maximum number of results to return. Default is 10. */
        fun limit(limit: Int?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Int) = limit(limit as Int?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Int>) = limit(limit.getOrNull())

        /** Include the names for any associated marketing campaigns. */
        fun marketingCampaignNames(marketingCampaignNames: Boolean?) = apply {
            this.marketingCampaignNames = marketingCampaignNames
        }

        /**
         * Alias for [Builder.marketingCampaignNames].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun marketingCampaignNames(marketingCampaignNames: Boolean) =
            marketingCampaignNames(marketingCampaignNames as Boolean?)

        /**
         * Alias for calling [Builder.marketingCampaignNames] with
         * `marketingCampaignNames.orElse(null)`.
         */
        fun marketingCampaignNames(marketingCampaignNames: Optional<Boolean>) =
            marketingCampaignNames(marketingCampaignNames.getOrNull())

        /**
         * Specifies which fields to use for sorting results. Valid fields are `name`, `createdAt`,
         * `updatedAt`, `createdBy`, `updatedBy`. `createdAt` will be used by default.
         */
        fun sort(sort: List<String>?) = apply { this.sort = sort?.toMutableList() }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<List<String>>) = sort(sort.getOrNull())

        /**
         * Adds a single [String] to [Builder.sort].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSort(sort: String) = apply {
            this.sort = (this.sort ?: mutableListOf()).apply { add(sort) }
        }

        /**
         * Email types to be filtered by. Multiple types can be included. All emails will be
         * returned if not present.
         */
        fun type(type: Type?) = apply { this.type = type }

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<Type>) = type(type.getOrNull())

        /** Only return emails last updated after the specified time. */
        fun updatedAfter(updatedAfter: OffsetDateTime?) = apply { this.updatedAfter = updatedAfter }

        /** Alias for calling [Builder.updatedAfter] with `updatedAfter.orElse(null)`. */
        fun updatedAfter(updatedAfter: Optional<OffsetDateTime>) =
            updatedAfter(updatedAfter.getOrNull())

        /** Only return emails last updated at exactly the specified time. */
        fun updatedAt(updatedAt: OffsetDateTime?) = apply { this.updatedAt = updatedAt }

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

        /** Only return emails last updated before the specified time. */
        fun updatedBefore(updatedBefore: OffsetDateTime?) = apply {
            this.updatedBefore = updatedBefore
        }

        /** Alias for calling [Builder.updatedBefore] with `updatedBefore.orElse(null)`. */
        fun updatedBefore(updatedBefore: Optional<OffsetDateTime>) =
            updatedBefore(updatedBefore.getOrNull())

        /** Include the names of any workflows associated with the returned emails. */
        fun workflowNames(workflowNames: Boolean?) = apply { this.workflowNames = workflowNames }

        /**
         * Alias for [Builder.workflowNames].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun workflowNames(workflowNames: Boolean) = workflowNames(workflowNames as Boolean?)

        /** Alias for calling [Builder.workflowNames] with `workflowNames.orElse(null)`. */
        fun workflowNames(workflowNames: Optional<Boolean>) =
            workflowNames(workflowNames.getOrNull())

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
         * Returns an immutable instance of [EmailListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmailListParams =
            EmailListParams(
                after,
                archived,
                campaign,
                createdAfter,
                createdAt,
                createdBefore,
                includedProperties?.toImmutable(),
                includeStats,
                isPublished,
                limit,
                marketingCampaignNames,
                sort?.toImmutable(),
                type,
                updatedAfter,
                updatedAt,
                updatedBefore,
                workflowNames,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                after?.let { put("after", it) }
                archived?.let { put("archived", it.toString()) }
                campaign?.let { put("campaign", it) }
                createdAfter?.let {
                    put("createdAfter", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAt?.let {
                    put("createdAt", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdBefore?.let {
                    put("createdBefore", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                includedProperties?.let { put("includedProperties", it.joinToString(",")) }
                includeStats?.let { put("includeStats", it.toString()) }
                isPublished?.let { put("isPublished", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                marketingCampaignNames?.let { put("marketingCampaignNames", it.toString()) }
                sort?.let { put("sort", it.joinToString(",")) }
                type?.let { put("type", it.toString()) }
                updatedAfter?.let {
                    put("updatedAfter", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                updatedAt?.let {
                    put("updatedAt", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                updatedBefore?.let {
                    put("updatedBefore", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                workflowNames?.let { put("workflowNames", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Email types to be filtered by. Multiple types can be included. All emails will be returned if
     * not present.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AB_EMAIL = of("AB_EMAIL")

            @JvmField val BATCH_EMAIL = of("BATCH_EMAIL")

            @JvmField val LOCALTIME_EMAIL = of("LOCALTIME_EMAIL")

            @JvmField val AUTOMATED_AB_EMAIL = of("AUTOMATED_AB_EMAIL")

            @JvmField val BLOG_EMAIL = of("BLOG_EMAIL")

            @JvmField val BLOG_EMAIL_CHILD = of("BLOG_EMAIL_CHILD")

            @JvmField val RSS_EMAIL = of("RSS_EMAIL")

            @JvmField val RSS_EMAIL_CHILD = of("RSS_EMAIL_CHILD")

            @JvmField val RESUBSCRIBE_EMAIL = of("RESUBSCRIBE_EMAIL")

            @JvmField val OPTIN_EMAIL = of("OPTIN_EMAIL")

            @JvmField val OPTIN_FOLLOWUP_EMAIL = of("OPTIN_FOLLOWUP_EMAIL")

            @JvmField val AUTOMATED_EMAIL = of("AUTOMATED_EMAIL")

            @JvmField val FEEDBACK_CES_EMAIL = of("FEEDBACK_CES_EMAIL")

            @JvmField val FEEDBACK_CUSTOM_EMAIL = of("FEEDBACK_CUSTOM_EMAIL")

            @JvmField val FEEDBACK_CUSTOM_SURVEY_EMAIL = of("FEEDBACK_CUSTOM_SURVEY_EMAIL")

            @JvmField val FEEDBACK_NPS_EMAIL = of("FEEDBACK_NPS_EMAIL")

            @JvmField val FOLLOWUP_EMAIL = of("FOLLOWUP_EMAIL")

            @JvmField val LEADFLOW_EMAIL = of("LEADFLOW_EMAIL")

            @JvmField val SINGLE_SEND_API = of("SINGLE_SEND_API")

            @JvmField val MARKETING_SINGLE_SEND_API = of("MARKETING_SINGLE_SEND_API")

            @JvmField val SMTP_TOKEN = of("SMTP_TOKEN")

            @JvmField val TICKET_EMAIL = of("TICKET_EMAIL")

            @JvmField val MEMBERSHIP_REGISTRATION_EMAIL = of("MEMBERSHIP_REGISTRATION_EMAIL")

            @JvmField val MEMBERSHIP_PASSWORD_SAVED_EMAIL = of("MEMBERSHIP_PASSWORD_SAVED_EMAIL")

            @JvmField val MEMBERSHIP_PASSWORD_RESET_EMAIL = of("MEMBERSHIP_PASSWORD_RESET_EMAIL")

            @JvmField
            val MEMBERSHIP_EMAIL_VERIFICATION_EMAIL = of("MEMBERSHIP_EMAIL_VERIFICATION_EMAIL")

            @JvmField
            val MEMBERSHIP_PASSWORDLESS_AUTH_EMAIL = of("MEMBERSHIP_PASSWORDLESS_AUTH_EMAIL")

            @JvmField
            val MEMBERSHIP_REGISTRATION_FOLLOW_UP_EMAIL =
                of("MEMBERSHIP_REGISTRATION_FOLLOW_UP_EMAIL")

            @JvmField val MEMBERSHIP_OTP_LOGIN_EMAIL = of("MEMBERSHIP_OTP_LOGIN_EMAIL")

            @JvmField val MEMBERSHIP_FOLLOW_UP_EMAIL = of("MEMBERSHIP_FOLLOW_UP_EMAIL")

            @JvmField val MEMBERSHIP_VERIFICATION_EMAIL = of("MEMBERSHIP_VERIFICATION_EMAIL")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            AB_EMAIL,
            BATCH_EMAIL,
            LOCALTIME_EMAIL,
            AUTOMATED_AB_EMAIL,
            BLOG_EMAIL,
            BLOG_EMAIL_CHILD,
            RSS_EMAIL,
            RSS_EMAIL_CHILD,
            RESUBSCRIBE_EMAIL,
            OPTIN_EMAIL,
            OPTIN_FOLLOWUP_EMAIL,
            AUTOMATED_EMAIL,
            FEEDBACK_CES_EMAIL,
            FEEDBACK_CUSTOM_EMAIL,
            FEEDBACK_CUSTOM_SURVEY_EMAIL,
            FEEDBACK_NPS_EMAIL,
            FOLLOWUP_EMAIL,
            LEADFLOW_EMAIL,
            SINGLE_SEND_API,
            MARKETING_SINGLE_SEND_API,
            SMTP_TOKEN,
            TICKET_EMAIL,
            MEMBERSHIP_REGISTRATION_EMAIL,
            MEMBERSHIP_PASSWORD_SAVED_EMAIL,
            MEMBERSHIP_PASSWORD_RESET_EMAIL,
            MEMBERSHIP_EMAIL_VERIFICATION_EMAIL,
            MEMBERSHIP_PASSWORDLESS_AUTH_EMAIL,
            MEMBERSHIP_REGISTRATION_FOLLOW_UP_EMAIL,
            MEMBERSHIP_OTP_LOGIN_EMAIL,
            MEMBERSHIP_FOLLOW_UP_EMAIL,
            MEMBERSHIP_VERIFICATION_EMAIL,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AB_EMAIL,
            BATCH_EMAIL,
            LOCALTIME_EMAIL,
            AUTOMATED_AB_EMAIL,
            BLOG_EMAIL,
            BLOG_EMAIL_CHILD,
            RSS_EMAIL,
            RSS_EMAIL_CHILD,
            RESUBSCRIBE_EMAIL,
            OPTIN_EMAIL,
            OPTIN_FOLLOWUP_EMAIL,
            AUTOMATED_EMAIL,
            FEEDBACK_CES_EMAIL,
            FEEDBACK_CUSTOM_EMAIL,
            FEEDBACK_CUSTOM_SURVEY_EMAIL,
            FEEDBACK_NPS_EMAIL,
            FOLLOWUP_EMAIL,
            LEADFLOW_EMAIL,
            SINGLE_SEND_API,
            MARKETING_SINGLE_SEND_API,
            SMTP_TOKEN,
            TICKET_EMAIL,
            MEMBERSHIP_REGISTRATION_EMAIL,
            MEMBERSHIP_PASSWORD_SAVED_EMAIL,
            MEMBERSHIP_PASSWORD_RESET_EMAIL,
            MEMBERSHIP_EMAIL_VERIFICATION_EMAIL,
            MEMBERSHIP_PASSWORDLESS_AUTH_EMAIL,
            MEMBERSHIP_REGISTRATION_FOLLOW_UP_EMAIL,
            MEMBERSHIP_OTP_LOGIN_EMAIL,
            MEMBERSHIP_FOLLOW_UP_EMAIL,
            MEMBERSHIP_VERIFICATION_EMAIL,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                AB_EMAIL -> Value.AB_EMAIL
                BATCH_EMAIL -> Value.BATCH_EMAIL
                LOCALTIME_EMAIL -> Value.LOCALTIME_EMAIL
                AUTOMATED_AB_EMAIL -> Value.AUTOMATED_AB_EMAIL
                BLOG_EMAIL -> Value.BLOG_EMAIL
                BLOG_EMAIL_CHILD -> Value.BLOG_EMAIL_CHILD
                RSS_EMAIL -> Value.RSS_EMAIL
                RSS_EMAIL_CHILD -> Value.RSS_EMAIL_CHILD
                RESUBSCRIBE_EMAIL -> Value.RESUBSCRIBE_EMAIL
                OPTIN_EMAIL -> Value.OPTIN_EMAIL
                OPTIN_FOLLOWUP_EMAIL -> Value.OPTIN_FOLLOWUP_EMAIL
                AUTOMATED_EMAIL -> Value.AUTOMATED_EMAIL
                FEEDBACK_CES_EMAIL -> Value.FEEDBACK_CES_EMAIL
                FEEDBACK_CUSTOM_EMAIL -> Value.FEEDBACK_CUSTOM_EMAIL
                FEEDBACK_CUSTOM_SURVEY_EMAIL -> Value.FEEDBACK_CUSTOM_SURVEY_EMAIL
                FEEDBACK_NPS_EMAIL -> Value.FEEDBACK_NPS_EMAIL
                FOLLOWUP_EMAIL -> Value.FOLLOWUP_EMAIL
                LEADFLOW_EMAIL -> Value.LEADFLOW_EMAIL
                SINGLE_SEND_API -> Value.SINGLE_SEND_API
                MARKETING_SINGLE_SEND_API -> Value.MARKETING_SINGLE_SEND_API
                SMTP_TOKEN -> Value.SMTP_TOKEN
                TICKET_EMAIL -> Value.TICKET_EMAIL
                MEMBERSHIP_REGISTRATION_EMAIL -> Value.MEMBERSHIP_REGISTRATION_EMAIL
                MEMBERSHIP_PASSWORD_SAVED_EMAIL -> Value.MEMBERSHIP_PASSWORD_SAVED_EMAIL
                MEMBERSHIP_PASSWORD_RESET_EMAIL -> Value.MEMBERSHIP_PASSWORD_RESET_EMAIL
                MEMBERSHIP_EMAIL_VERIFICATION_EMAIL -> Value.MEMBERSHIP_EMAIL_VERIFICATION_EMAIL
                MEMBERSHIP_PASSWORDLESS_AUTH_EMAIL -> Value.MEMBERSHIP_PASSWORDLESS_AUTH_EMAIL
                MEMBERSHIP_REGISTRATION_FOLLOW_UP_EMAIL ->
                    Value.MEMBERSHIP_REGISTRATION_FOLLOW_UP_EMAIL
                MEMBERSHIP_OTP_LOGIN_EMAIL -> Value.MEMBERSHIP_OTP_LOGIN_EMAIL
                MEMBERSHIP_FOLLOW_UP_EMAIL -> Value.MEMBERSHIP_FOLLOW_UP_EMAIL
                MEMBERSHIP_VERIFICATION_EMAIL -> Value.MEMBERSHIP_VERIFICATION_EMAIL
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
                AB_EMAIL -> Known.AB_EMAIL
                BATCH_EMAIL -> Known.BATCH_EMAIL
                LOCALTIME_EMAIL -> Known.LOCALTIME_EMAIL
                AUTOMATED_AB_EMAIL -> Known.AUTOMATED_AB_EMAIL
                BLOG_EMAIL -> Known.BLOG_EMAIL
                BLOG_EMAIL_CHILD -> Known.BLOG_EMAIL_CHILD
                RSS_EMAIL -> Known.RSS_EMAIL
                RSS_EMAIL_CHILD -> Known.RSS_EMAIL_CHILD
                RESUBSCRIBE_EMAIL -> Known.RESUBSCRIBE_EMAIL
                OPTIN_EMAIL -> Known.OPTIN_EMAIL
                OPTIN_FOLLOWUP_EMAIL -> Known.OPTIN_FOLLOWUP_EMAIL
                AUTOMATED_EMAIL -> Known.AUTOMATED_EMAIL
                FEEDBACK_CES_EMAIL -> Known.FEEDBACK_CES_EMAIL
                FEEDBACK_CUSTOM_EMAIL -> Known.FEEDBACK_CUSTOM_EMAIL
                FEEDBACK_CUSTOM_SURVEY_EMAIL -> Known.FEEDBACK_CUSTOM_SURVEY_EMAIL
                FEEDBACK_NPS_EMAIL -> Known.FEEDBACK_NPS_EMAIL
                FOLLOWUP_EMAIL -> Known.FOLLOWUP_EMAIL
                LEADFLOW_EMAIL -> Known.LEADFLOW_EMAIL
                SINGLE_SEND_API -> Known.SINGLE_SEND_API
                MARKETING_SINGLE_SEND_API -> Known.MARKETING_SINGLE_SEND_API
                SMTP_TOKEN -> Known.SMTP_TOKEN
                TICKET_EMAIL -> Known.TICKET_EMAIL
                MEMBERSHIP_REGISTRATION_EMAIL -> Known.MEMBERSHIP_REGISTRATION_EMAIL
                MEMBERSHIP_PASSWORD_SAVED_EMAIL -> Known.MEMBERSHIP_PASSWORD_SAVED_EMAIL
                MEMBERSHIP_PASSWORD_RESET_EMAIL -> Known.MEMBERSHIP_PASSWORD_RESET_EMAIL
                MEMBERSHIP_EMAIL_VERIFICATION_EMAIL -> Known.MEMBERSHIP_EMAIL_VERIFICATION_EMAIL
                MEMBERSHIP_PASSWORDLESS_AUTH_EMAIL -> Known.MEMBERSHIP_PASSWORDLESS_AUTH_EMAIL
                MEMBERSHIP_REGISTRATION_FOLLOW_UP_EMAIL ->
                    Known.MEMBERSHIP_REGISTRATION_FOLLOW_UP_EMAIL
                MEMBERSHIP_OTP_LOGIN_EMAIL -> Known.MEMBERSHIP_OTP_LOGIN_EMAIL
                MEMBERSHIP_FOLLOW_UP_EMAIL -> Known.MEMBERSHIP_FOLLOW_UP_EMAIL
                MEMBERSHIP_VERIFICATION_EMAIL -> Known.MEMBERSHIP_VERIFICATION_EMAIL
                else -> throw HubSpotInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailListParams &&
            after == other.after &&
            archived == other.archived &&
            campaign == other.campaign &&
            createdAfter == other.createdAfter &&
            createdAt == other.createdAt &&
            createdBefore == other.createdBefore &&
            includedProperties == other.includedProperties &&
            includeStats == other.includeStats &&
            isPublished == other.isPublished &&
            limit == other.limit &&
            marketingCampaignNames == other.marketingCampaignNames &&
            sort == other.sort &&
            type == other.type &&
            updatedAfter == other.updatedAfter &&
            updatedAt == other.updatedAt &&
            updatedBefore == other.updatedBefore &&
            workflowNames == other.workflowNames &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            after,
            archived,
            campaign,
            createdAfter,
            createdAt,
            createdBefore,
            includedProperties,
            includeStats,
            isPublished,
            limit,
            marketingCampaignNames,
            sort,
            type,
            updatedAfter,
            updatedAt,
            updatedBefore,
            workflowNames,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EmailListParams{after=$after, archived=$archived, campaign=$campaign, createdAfter=$createdAfter, createdAt=$createdAt, createdBefore=$createdBefore, includedProperties=$includedProperties, includeStats=$includeStats, isPublished=$isPublished, limit=$limit, marketingCampaignNames=$marketingCampaignNames, sort=$sort, type=$type, updatedAfter=$updatedAfter, updatedAt=$updatedAt, updatedBefore=$updatedBefore, workflowNames=$workflowNames, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
