// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PreResolvedContact
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contactPropertiesLeadingToMatch: JsonField<List<ContactPropertiesLeadingToMatch>>,
    private val contactVid: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("contactPropertiesLeadingToMatch")
        @ExcludeMissing
        contactPropertiesLeadingToMatch: JsonField<List<ContactPropertiesLeadingToMatch>> =
            JsonMissing.of(),
        @JsonProperty("contactVid") @ExcludeMissing contactVid: JsonField<Int> = JsonMissing.of(),
    ) : this(contactPropertiesLeadingToMatch, contactVid, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contactPropertiesLeadingToMatch(): List<ContactPropertiesLeadingToMatch> =
        contactPropertiesLeadingToMatch.getRequired("contactPropertiesLeadingToMatch")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contactVid(): Int = contactVid.getRequired("contactVid")

    /**
     * Returns the raw JSON value of [contactPropertiesLeadingToMatch].
     *
     * Unlike [contactPropertiesLeadingToMatch], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("contactPropertiesLeadingToMatch")
    @ExcludeMissing
    fun _contactPropertiesLeadingToMatch(): JsonField<List<ContactPropertiesLeadingToMatch>> =
        contactPropertiesLeadingToMatch

    /**
     * Returns the raw JSON value of [contactVid].
     *
     * Unlike [contactVid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contactVid") @ExcludeMissing fun _contactVid(): JsonField<Int> = contactVid

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
         * Returns a mutable builder for constructing an instance of [PreResolvedContact].
         *
         * The following fields are required:
         * ```java
         * .contactPropertiesLeadingToMatch()
         * .contactVid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreResolvedContact]. */
    class Builder internal constructor() {

        private var contactPropertiesLeadingToMatch:
            JsonField<MutableList<ContactPropertiesLeadingToMatch>>? =
            null
        private var contactVid: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(preResolvedContact: PreResolvedContact) = apply {
            contactPropertiesLeadingToMatch =
                preResolvedContact.contactPropertiesLeadingToMatch.map { it.toMutableList() }
            contactVid = preResolvedContact.contactVid
            additionalProperties = preResolvedContact.additionalProperties.toMutableMap()
        }

        fun contactPropertiesLeadingToMatch(
            contactPropertiesLeadingToMatch: List<ContactPropertiesLeadingToMatch>
        ) = contactPropertiesLeadingToMatch(JsonField.of(contactPropertiesLeadingToMatch))

        /**
         * Sets [Builder.contactPropertiesLeadingToMatch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactPropertiesLeadingToMatch] with a well-typed
         * `List<ContactPropertiesLeadingToMatch>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun contactPropertiesLeadingToMatch(
            contactPropertiesLeadingToMatch: JsonField<List<ContactPropertiesLeadingToMatch>>
        ) = apply {
            this.contactPropertiesLeadingToMatch =
                contactPropertiesLeadingToMatch.map { it.toMutableList() }
        }

        /**
         * Adds a single [ContactPropertiesLeadingToMatch] to
         * [Builder.contactPropertiesLeadingToMatch].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContactPropertiesLeadingToMatch(
            contactPropertiesLeadingToMatch: ContactPropertiesLeadingToMatch
        ) = apply {
            this.contactPropertiesLeadingToMatch =
                (this.contactPropertiesLeadingToMatch ?: JsonField.of(mutableListOf())).also {
                    checkKnown("contactPropertiesLeadingToMatch", it)
                        .add(contactPropertiesLeadingToMatch)
                }
        }

        fun contactVid(contactVid: Int) = contactVid(JsonField.of(contactVid))

        /**
         * Sets [Builder.contactVid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactVid] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun contactVid(contactVid: JsonField<Int>) = apply { this.contactVid = contactVid }

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
         * Returns an immutable instance of [PreResolvedContact].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contactPropertiesLeadingToMatch()
         * .contactVid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreResolvedContact =
            PreResolvedContact(
                checkRequired("contactPropertiesLeadingToMatch", contactPropertiesLeadingToMatch)
                    .map { it.toImmutable() },
                checkRequired("contactVid", contactVid),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PreResolvedContact = apply {
        if (validated) {
            return@apply
        }

        contactPropertiesLeadingToMatch().forEach { it.validate() }
        contactVid()
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
        (contactPropertiesLeadingToMatch.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
            ?: 0) + (if (contactVid.asKnown().isPresent) 1 else 0)

    class ContactPropertiesLeadingToMatch
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ADDRESS = of("address")

            @JvmField val ANNUALREVENUE = of("annualrevenue")

            @JvmField val ASSOCIATEDCOMPANYID = of("associatedcompanyid")

            @JvmField val ASSOCIATEDCOMPANYLASTUPDATED = of("associatedcompanylastupdated")

            @JvmField val CITY = of("city")

            @JvmField val CLOSEDATE = of("closedate")

            @JvmField val COMPANY = of("company")

            @JvmField val COMPANY_SIZE = of("company_size")

            @JvmField val COUNTRY = of("country")

            @JvmField val CREATEDATE = of("createdate")

            @JvmField val CURRENTLYINWORKFLOW = of("currentlyinworkflow")

            @JvmField val DATE_OF_BIRTH = of("date_of_birth")

            @JvmField val DAYS_TO_CLOSE = of("days_to_close")

            @JvmField val DEGREE = of("degree")

            @JvmField val EMAIL = of("email")

            @JvmField val ENGAGEMENTS_LAST_MEETING_BOOKED = of("engagements_last_meeting_booked")

            @JvmField
            val ENGAGEMENTS_LAST_MEETING_BOOKED_CAMPAIGN =
                of("engagements_last_meeting_booked_campaign")

            @JvmField
            val ENGAGEMENTS_LAST_MEETING_BOOKED_MEDIUM =
                of("engagements_last_meeting_booked_medium")

            @JvmField
            val ENGAGEMENTS_LAST_MEETING_BOOKED_SOURCE =
                of("engagements_last_meeting_booked_source")

            @JvmField val FAX = of("fax")

            @JvmField val FIELD_OF_STUDY = of("field_of_study")

            @JvmField val FIRST_CONVERSION_DATE = of("first_conversion_date")

            @JvmField val FIRST_CONVERSION_EVENT_NAME = of("first_conversion_event_name")

            @JvmField val FIRST_DEAL_CREATED_DATE = of("first_deal_created_date")

            @JvmField val FIRSTNAME = of("firstname")

            @JvmField val FOLLOWERCOUNT = of("followercount")

            @JvmField val GENDER = of("gender")

            @JvmField val GRADUATION_DATE = of("graduation_date")

            @JvmField val HS_ADDITIONAL_EMAILS = of("hs_additional_emails")

            @JvmField val HS_ALL_CONTACT_VIDS = of("hs_all_contact_vids")

            @JvmField val HS_ANALYTICS_AVERAGE_PAGE_VIEWS = of("hs_analytics_average_page_views")

            @JvmField val HS_ANALYTICS_FIRST_REFERRER = of("hs_analytics_first_referrer")

            @JvmField val HS_ANALYTICS_FIRST_TIMESTAMP = of("hs_analytics_first_timestamp")

            @JvmField
            val HS_ANALYTICS_FIRST_TOUCH_CONVERTING_CAMPAIGN =
                of("hs_analytics_first_touch_converting_campaign")

            @JvmField val HS_ANALYTICS_FIRST_URL = of("hs_analytics_first_url")

            @JvmField
            val HS_ANALYTICS_FIRST_VISIT_TIMESTAMP = of("hs_analytics_first_visit_timestamp")

            @JvmField val HS_ANALYTICS_LAST_REFERRER = of("hs_analytics_last_referrer")

            @JvmField val HS_ANALYTICS_LAST_TIMESTAMP = of("hs_analytics_last_timestamp")

            @JvmField
            val HS_ANALYTICS_LAST_TOUCH_CONVERTING_CAMPAIGN =
                of("hs_analytics_last_touch_converting_campaign")

            @JvmField val HS_ANALYTICS_LAST_URL = of("hs_analytics_last_url")

            @JvmField
            val HS_ANALYTICS_LAST_VISIT_TIMESTAMP = of("hs_analytics_last_visit_timestamp")

            @JvmField
            val HS_ANALYTICS_NUM_EVENT_COMPLETIONS = of("hs_analytics_num_event_completions")

            @JvmField val HS_ANALYTICS_NUM_PAGE_VIEWS = of("hs_analytics_num_page_views")

            @JvmField val HS_ANALYTICS_NUM_VISITS = of("hs_analytics_num_visits")

            @JvmField val HS_ANALYTICS_REVENUE = of("hs_analytics_revenue")

            @JvmField val HS_ANALYTICS_SOURCE = of("hs_analytics_source")

            @JvmField
            val HS_ANALYTICS_SOURCE_COMPOSITE_DATA = of("hs_analytics_source_composite_data")

            @JvmField val HS_ANALYTICS_SOURCE_DATA_1 = of("hs_analytics_source_data_1")

            @JvmField val HS_ANALYTICS_SOURCE_DATA_2 = of("hs_analytics_source_data_2")

            @JvmField val HS_ASSOCIATED_TARGET_ACCOUNTS = of("hs_associated_target_accounts")

            @JvmField val HS_AVATAR_FILEMANAGER_KEY = of("hs_avatar_filemanager_key")

            @JvmField val HS_BING_AD_CLICKED = of("hs_bing_ad_clicked")

            @JvmField val HS_BING_CLICK_ID = of("hs_bing_click_id")

            @JvmField val HS_BUYING_ROLE = of("hs_buying_role")

            @JvmField val HS_CALCULATED_FORM_SUBMISSIONS = of("hs_calculated_form_submissions")

            @JvmField val HS_CALCULATED_MERGED_VIDS = of("hs_calculated_merged_vids")

            @JvmField val HS_CALCULATED_MOBILE_NUMBER = of("hs_calculated_mobile_number")

            @JvmField val HS_CALCULATED_PHONE_NUMBER = of("hs_calculated_phone_number")

            @JvmField
            val HS_CALCULATED_PHONE_NUMBER_AREA_CODE = of("hs_calculated_phone_number_area_code")

            @JvmField
            val HS_CALCULATED_PHONE_NUMBER_COUNTRY_CODE =
                of("hs_calculated_phone_number_country_code")

            @JvmField
            val HS_CALCULATED_PHONE_NUMBER_REGION_CODE =
                of("hs_calculated_phone_number_region_code")

            @JvmField val HS_CHAT_ASSISTANT_IQL_DATE = of("hs_chat_assistant_iql_date")

            @JvmField val HS_CHAT_ASSISTANT_SOURCE = of("hs_chat_assistant_source")

            @JvmField val HS_CHAT_ASSISTANT_SUMMARY = of("hs_chat_assistant_summary")

            @JvmField val HS_CLICKED_LINKEDIN_AD = of("hs_clicked_linkedin_ad")

            @JvmField
            val HS_CONTACT_CREATION_LEGAL_BASIS_SOURCE_INSTANCE_ID =
                of("hs_contact_creation_legal_basis_source_instance_id")

            @JvmField val HS_CONTACT_ENRICHMENT_OPT_OUT = of("hs_contact_enrichment_opt_out")

            @JvmField
            val HS_CONTACT_ENRICHMENT_OPT_OUT_TIMESTAMP =
                of("hs_contact_enrichment_opt_out_timestamp")

            @JvmField val HS_CONTENT_MEMBERSHIP_EMAIL = of("hs_content_membership_email")

            @JvmField
            val HS_CONTENT_MEMBERSHIP_EMAIL_CONFIRMED = of("hs_content_membership_email_confirmed")

            @JvmField
            val HS_CONTENT_MEMBERSHIP_FOLLOW_UP_ENQUEUED_AT =
                of("hs_content_membership_follow_up_enqueued_at")

            @JvmField val HS_CONTENT_MEMBERSHIP_NOTES = of("hs_content_membership_notes")

            @JvmField
            val HS_CONTENT_MEMBERSHIP_REGISTERED_AT = of("hs_content_membership_registered_at")

            @JvmField
            val HS_CONTENT_MEMBERSHIP_REGISTRATION_DOMAIN_SENT_TO =
                of("hs_content_membership_registration_domain_sent_to")

            @JvmField
            val HS_CONTENT_MEMBERSHIP_REGISTRATION_EMAIL_SENT_AT =
                of("hs_content_membership_registration_email_sent_at")

            @JvmField val HS_CONTENT_MEMBERSHIP_STATUS = of("hs_content_membership_status")

            @JvmField val HS_CONVERSATIONS_VISITOR_EMAIL = of("hs_conversations_visitor_email")

            @JvmField val HS_COUNT_IS_UNWORKED = of("hs_count_is_unworked")

            @JvmField val HS_COUNT_IS_WORKED = of("hs_count_is_worked")

            @JvmField val HS_COUNTRY_REGION_CODE = of("hs_country_region_code")

            @JvmField val HS_CREATED_BY_CONVERSATIONS = of("hs_created_by_conversations")

            @JvmField val HS_CROSS_ACCOUNT_NOTE = of("hs_cross_account_note")

            @JvmField val HS_CROSS_SELL_OPPORTUNITY = of("hs_cross_sell_opportunity")

            @JvmField val HS_CURRENT_CUSTOMER = of("hs_current_customer")

            @JvmField
            val HS_CURRENTLY_ENROLLED_IN_PROSPECTING_AGENT =
                of("hs_currently_enrolled_in_prospecting_agent")

            @JvmField val HS_CUSTOMER_AGENT_LEAD_STATUS = of("hs_customer_agent_lead_status")

            @JvmField val HS_DATA_PRIVACY_ADS_CONSENT = of("hs_data_privacy_ads_consent")

            @JvmField val HS_DATE_ENTERED_CUSTOMER = of("hs_date_entered_customer")

            @JvmField val HS_DATE_ENTERED_EVANGELIST = of("hs_date_entered_evangelist")

            @JvmField val HS_DATE_ENTERED_LEAD = of("hs_date_entered_lead")

            @JvmField
            val HS_DATE_ENTERED_MARKETINGQUALIFIEDLEAD =
                of("hs_date_entered_marketingqualifiedlead")

            @JvmField val HS_DATE_ENTERED_OPPORTUNITY = of("hs_date_entered_opportunity")

            @JvmField val HS_DATE_ENTERED_OTHER = of("hs_date_entered_other")

            @JvmField
            val HS_DATE_ENTERED_SALESQUALIFIEDLEAD = of("hs_date_entered_salesqualifiedlead")

            @JvmField val HS_DATE_ENTERED_SUBSCRIBER = of("hs_date_entered_subscriber")

            @JvmField val HS_DATE_EXITED_CUSTOMER = of("hs_date_exited_customer")

            @JvmField val HS_DATE_EXITED_EVANGELIST = of("hs_date_exited_evangelist")

            @JvmField val HS_DATE_EXITED_LEAD = of("hs_date_exited_lead")

            @JvmField
            val HS_DATE_EXITED_MARKETINGQUALIFIEDLEAD = of("hs_date_exited_marketingqualifiedlead")

            @JvmField val HS_DATE_EXITED_OPPORTUNITY = of("hs_date_exited_opportunity")

            @JvmField val HS_DATE_EXITED_OTHER = of("hs_date_exited_other")

            @JvmField
            val HS_DATE_EXITED_SALESQUALIFIEDLEAD = of("hs_date_exited_salesqualifiedlead")

            @JvmField val HS_DATE_EXITED_SUBSCRIBER = of("hs_date_exited_subscriber")

            @JvmField val HS_DOCUMENT_LAST_REVISITED = of("hs_document_last_revisited")

            @JvmField val HS_EMAIL_BAD_ADDRESS = of("hs_email_bad_address")

            @JvmField val HS_EMAIL_BOUNCE = of("hs_email_bounce")

            @JvmField val HS_EMAIL_CLICK = of("hs_email_click")

            @JvmField
            val HS_EMAIL_CUSTOMER_QUARANTINED_REASON = of("hs_email_customer_quarantined_reason")

            @JvmField val HS_EMAIL_DELIVERED = of("hs_email_delivered")

            @JvmField val HS_EMAIL_DOMAIN = of("hs_email_domain")

            @JvmField val HS_EMAIL_FIRST_CLICK_DATE = of("hs_email_first_click_date")

            @JvmField val HS_EMAIL_FIRST_OPEN_DATE = of("hs_email_first_open_date")

            @JvmField val HS_EMAIL_FIRST_REPLY_DATE = of("hs_email_first_reply_date")

            @JvmField val HS_EMAIL_FIRST_SEND_DATE = of("hs_email_first_send_date")

            @JvmField val HS_EMAIL_HARD_BOUNCE_REASON = of("hs_email_hard_bounce_reason")

            @JvmField val HS_EMAIL_HARD_BOUNCE_REASON_ENUM = of("hs_email_hard_bounce_reason_enum")

            @JvmField val HS_EMAIL_IS_INELIGIBLE = of("hs_email_is_ineligible")

            @JvmField val HS_EMAIL_LAST_CLICK_DATE = of("hs_email_last_click_date")

            @JvmField val HS_EMAIL_LAST_EMAIL_NAME = of("hs_email_last_email_name")

            @JvmField val HS_EMAIL_LAST_OPEN_DATE = of("hs_email_last_open_date")

            @JvmField val HS_EMAIL_LAST_REPLY_DATE = of("hs_email_last_reply_date")

            @JvmField val HS_EMAIL_LAST_SEND_DATE = of("hs_email_last_send_date")

            @JvmField
            val HS_EMAIL_LIVE_SOURCING_RESTRICTED = of("hs_email_live_sourcing_restricted")

            @JvmField val HS_EMAIL_OPEN = of("hs_email_open")

            @JvmField
            val HS_EMAIL_OPTIMAL_SEND_DAY_OF_WEEK = of("hs_email_optimal_send_day_of_week")

            @JvmField
            val HS_EMAIL_OPTIMAL_SEND_TIME_OF_DAY = of("hs_email_optimal_send_time_of_day")

            @JvmField val HS_EMAIL_OPTOUT = of("hs_email_optout")

            @JvmField val HS_EMAIL_OPTOUT_SURVEY_REASON = of("hs_email_optout_survey_reason")

            @JvmField val HS_EMAIL_QUARANTINED = of("hs_email_quarantined")

            @JvmField val HS_EMAIL_QUARANTINED_REASON = of("hs_email_quarantined_reason")

            @JvmField
            val HS_EMAIL_RECIPIENT_FATIGUE_RECOVERY_TIME =
                of("hs_email_recipient_fatigue_recovery_time")

            @JvmField val HS_EMAIL_REPLIED = of("hs_email_replied")

            @JvmField
            val HS_EMAIL_SENDS_SINCE_LAST_ENGAGEMENT = of("hs_email_sends_since_last_engagement")

            @JvmField val HS_EMAIL_TYPE = of("hs_email_type")

            @JvmField val HS_EMAILCONFIRMATIONSTATUS = of("hs_emailconfirmationstatus")

            @JvmField
            val HS_EMPLOYMENT_CHANGE_DETECTED_DATE = of("hs_employment_change_detected_date")

            @JvmField
            val HS_ENRICHED_EMAIL_BOUNCE_DETECTED = of("hs_enriched_email_bounce_detected")

            @JvmField val HS_FACEBOOK_AD_CLICKED = of("hs_facebook_ad_clicked")

            @JvmField val HS_FACEBOOK_CLICK_ID = of("hs_facebook_click_id")

            @JvmField val HS_FACEBOOKID = of("hs_facebookid")

            @JvmField val HS_FEEDBACK_LAST_CES_SURVEY_DATE = of("hs_feedback_last_ces_survey_date")

            @JvmField
            val HS_FEEDBACK_LAST_CES_SURVEY_FOLLOW_UP = of("hs_feedback_last_ces_survey_follow_up")

            @JvmField
            val HS_FEEDBACK_LAST_CES_SURVEY_RATING = of("hs_feedback_last_ces_survey_rating")

            @JvmField
            val HS_FEEDBACK_LAST_CSAT_SURVEY_DATE = of("hs_feedback_last_csat_survey_date")

            @JvmField
            val HS_FEEDBACK_LAST_CSAT_SURVEY_FOLLOW_UP =
                of("hs_feedback_last_csat_survey_follow_up")

            @JvmField
            val HS_FEEDBACK_LAST_CSAT_SURVEY_RATING = of("hs_feedback_last_csat_survey_rating")

            @JvmField val HS_FEEDBACK_LAST_NPS_FOLLOW_UP = of("hs_feedback_last_nps_follow_up")

            @JvmField val HS_FEEDBACK_LAST_NPS_RATING = of("hs_feedback_last_nps_rating")

            @JvmField
            val HS_FEEDBACK_LAST_NPS_RATING_NUMBER = of("hs_feedback_last_nps_rating_number")

            @JvmField val HS_FEEDBACK_LAST_SURVEY_DATE = of("hs_feedback_last_survey_date")

            @JvmField val HS_FEEDBACK_SHOW_NPS_WEB_SURVEY = of("hs_feedback_show_nps_web_survey")

            @JvmField val HS_FIRST_CLOSED_ORDER_ID = of("hs_first_closed_order_id")

            @JvmField val HS_FIRST_ENGAGEMENT_OBJECT_ID = of("hs_first_engagement_object_id")

            @JvmField val HS_FIRST_ORDER_CLOSED_DATE = of("hs_first_order_closed_date")

            @JvmField val HS_FIRST_OUTREACH_DATE = of("hs_first_outreach_date")

            @JvmField
            val HS_FIRST_SUBSCRIPTION_CREATE_DATE = of("hs_first_subscription_create_date")

            @JvmField val HS_FULL_NAME_OR_EMAIL = of("hs_full_name_or_email")

            @JvmField val HS_GOOGLE_CLICK_ID = of("hs_google_click_id")

            @JvmField val HS_GOOGLEPLUSID = of("hs_googleplusid")

            @JvmField val HS_GPS_COORDINATES = of("hs_gps_coordinates")

            @JvmField val HS_GPS_ERROR = of("hs_gps_error")

            @JvmField val HS_GPS_LATITUDE = of("hs_gps_latitude")

            @JvmField val HS_GPS_LONGITUDE = of("hs_gps_longitude")

            @JvmField val HS_HAS_ACTIVE_SUBSCRIPTION = of("hs_has_active_subscription")

            @JvmField val HS_INFERRED_LANGUAGE_CODES = of("hs_inferred_language_codes")

            @JvmField val HS_INTENT_PAID_UP_TO_DATE = of("hs_intent_paid_up_to_date")

            @JvmField val HS_INTENT_SIGNALS_ENABLED = of("hs_intent_signals_enabled")

            @JvmField val HS_IP_TIMEZONE = of("hs_ip_timezone")

            @JvmField val HS_IS_CONTACT = of("hs_is_contact")

            @JvmField val HS_IS_ENRICHED = of("hs_is_enriched")

            @JvmField val HS_IS_MERGE_REVERTIBLE = of("hs_is_merge_revertible")

            @JvmField val HS_IS_UNWORKED = of("hs_is_unworked")

            @JvmField val HS_JOB_CHANGE_DETECTED_DATE = of("hs_job_change_detected_date")

            @JvmField val HS_JOURNEY_STAGE = of("hs_journey_stage")

            @JvmField val HS_LANGUAGE = of("hs_language")

            @JvmField
            val HS_LAST_METERED_ENRICHMENT_TIMESTAMP = of("hs_last_metered_enrichment_timestamp")

            @JvmField val HS_LAST_SALES_ACTIVITY_DATE = of("hs_last_sales_activity_date")

            @JvmField val HS_LAST_SALES_ACTIVITY_TIMESTAMP = of("hs_last_sales_activity_timestamp")

            @JvmField val HS_LAST_SALES_ACTIVITY_TYPE = of("hs_last_sales_activity_type")

            @JvmField val HS_LAST_SMS_SEND_DATE = of("hs_last_sms_send_date")

            @JvmField val HS_LAST_SMS_SEND_NAME = of("hs_last_sms_send_name")

            @JvmField val HS_LATEST_DISQUALIFIED_LEAD_DATE = of("hs_latest_disqualified_lead_date")

            @JvmField val HS_LATEST_MEETING_ACTIVITY = of("hs_latest_meeting_activity")

            @JvmField val HS_LATEST_OPEN_LEAD_DATE = of("hs_latest_open_lead_date")

            @JvmField val HS_LATEST_QUALIFIED_LEAD_DATE = of("hs_latest_qualified_lead_date")

            @JvmField val HS_LATEST_SEQUENCE_ENDED_DATE = of("hs_latest_sequence_ended_date")

            @JvmField val HS_LATEST_SEQUENCE_ENROLLED = of("hs_latest_sequence_enrolled")

            @JvmField val HS_LATEST_SEQUENCE_ENROLLED_DATE = of("hs_latest_sequence_enrolled_date")

            @JvmField val HS_LATEST_SEQUENCE_FINISHED_DATE = of("hs_latest_sequence_finished_date")

            @JvmField
            val HS_LATEST_SEQUENCE_UNENROLLED_DATE = of("hs_latest_sequence_unenrolled_date")

            @JvmField val HS_LATEST_SOURCE = of("hs_latest_source")

            @JvmField val HS_LATEST_SOURCE_COMPOSITE_DATA = of("hs_latest_source_composite_data")

            @JvmField val HS_LATEST_SOURCE_DATA_1 = of("hs_latest_source_data_1")

            @JvmField val HS_LATEST_SOURCE_DATA_2 = of("hs_latest_source_data_2")

            @JvmField val HS_LATEST_SOURCE_TIMESTAMP = of("hs_latest_source_timestamp")

            @JvmField
            val HS_LATEST_SUBSCRIPTION_CREATE_DATE = of("hs_latest_subscription_create_date")

            @JvmField val HS_LATITUDE = of("hs_latitude")

            @JvmField val HS_LEAD_STATUS = of("hs_lead_status")

            @JvmField val HS_LEGAL_BASIS = of("hs_legal_basis")

            @JvmField val HS_LIFECYCLESTAGE_CUSTOMER_DATE = of("hs_lifecyclestage_customer_date")

            @JvmField
            val HS_LIFECYCLESTAGE_EVANGELIST_DATE = of("hs_lifecyclestage_evangelist_date")

            @JvmField val HS_LIFECYCLESTAGE_LEAD_DATE = of("hs_lifecyclestage_lead_date")

            @JvmField
            val HS_LIFECYCLESTAGE_MARKETINGQUALIFIEDLEAD_DATE =
                of("hs_lifecyclestage_marketingqualifiedlead_date")

            @JvmField
            val HS_LIFECYCLESTAGE_OPPORTUNITY_DATE = of("hs_lifecyclestage_opportunity_date")

            @JvmField val HS_LIFECYCLESTAGE_OTHER_DATE = of("hs_lifecyclestage_other_date")

            @JvmField
            val HS_LIFECYCLESTAGE_SALESQUALIFIEDLEAD_DATE =
                of("hs_lifecyclestage_salesqualifiedlead_date")

            @JvmField
            val HS_LIFECYCLESTAGE_SUBSCRIBER_DATE = of("hs_lifecyclestage_subscriber_date")

            @JvmField val HS_LINKEDIN_AD_CLICKED = of("hs_linkedin_ad_clicked")

            @JvmField val HS_LINKEDIN_CLICK_ID = of("hs_linkedin_click_id")

            @JvmField val HS_LINKEDIN_URL = of("hs_linkedin_url")

            @JvmField val HS_LINKEDINID = of("hs_linkedinid")

            @JvmField val HS_LIVE_ENRICHMENT_DEADLINE = of("hs_live_enrichment_deadline")

            @JvmField val HS_LONGITUDE = of("hs_longitude")

            @JvmField val HS_MANUAL_CAMPAIGN_IDS = of("hs_manual_campaign_ids")

            @JvmField val HS_MARKETABLE_REASON_ID = of("hs_marketable_reason_id")

            @JvmField val HS_MARKETABLE_REASON_TYPE = of("hs_marketable_reason_type")

            @JvmField val HS_MARKETABLE_STATUS = of("hs_marketable_status")

            @JvmField val HS_MARKETABLE_UNTIL_RENEWAL = of("hs_marketable_until_renewal")

            @JvmField
            val HS_MEMBERSHIP_HAS_ACCESSED_PRIVATE_CONTENT =
                of("hs_membership_has_accessed_private_content")

            @JvmField
            val HS_MEMBERSHIP_LAST_PRIVATE_CONTENT_ACCESS_DATE =
                of("hs_membership_last_private_content_access_date")

            @JvmField val HS_MESSAGING_ENGAGEMENT_SCORE = of("hs_messaging_engagement_score")

            @JvmField val HS_MOBILE_SDK_PUSH_TOKENS = of("hs_mobile_sdk_push_tokens")

            @JvmField val HS_NOTES_LAST_ACTIVITY = of("hs_notes_last_activity")

            @JvmField val HS_NOTES_NEXT_ACTIVITY = of("hs_notes_next_activity")

            @JvmField val HS_NOTES_NEXT_ACTIVITY_TYPE = of("hs_notes_next_activity_type")

            @JvmField val HS_PERSONA = of("hs_persona")

            @JvmField val HS_PINNED_ENGAGEMENT_ID = of("hs_pinned_engagement_id")

            @JvmField val HS_PIPELINE = of("hs_pipeline")

            @JvmField val HS_PREDICTIVECONTACTSCORE = of("hs_predictivecontactscore")

            @JvmField val HS_PREDICTIVECONTACTSCORE_TMP = of("hs_predictivecontactscore_tmp")

            @JvmField val HS_PREDICTIVECONTACTSCORE_V2 = of("hs_predictivecontactscore_v2")

            @JvmField val HS_PREDICTIVECONTACTSCOREBUCKET = of("hs_predictivecontactscorebucket")

            @JvmField val HS_PREDICTIVESCORINGTIER = of("hs_predictivescoringtier")

            @JvmField val HS_PREDICTIVESCORINGTIER_TMP = of("hs_predictivescoringtier_tmp")

            @JvmField
            val HS_PROSPECTING_AGENT_ACTIVELY_ENROLLED_COUNT =
                of("hs_prospecting_agent_actively_enrolled_count")

            @JvmField
            val HS_PROSPECTING_AGENT_LAST_ENROLLED = of("hs_prospecting_agent_last_enrolled")

            @JvmField
            val HS_PROSPECTING_AGENT_TOTAL_ENROLLED_COUNT =
                of("hs_prospecting_agent_total_enrolled_count")

            @JvmField val HS_QUARANTINED_EMAILS = of("hs_quarantined_emails")

            @JvmField val HS_RECENT_CLOSED_ORDER_DATE = of("hs_recent_closed_order_date")

            @JvmField val HS_REGISTERED_MEMBER = of("hs_registered_member")

            @JvmField val HS_REGISTRATION_METHOD = of("hs_registration_method")

            @JvmField
            val HS_RETURNING_TO_OFFICE_DETECTED_DATE = of("hs_returning_to_office_detected_date")

            @JvmField val HS_ROLE = of("hs_role")

            @JvmField val HS_SA_FIRST_ENGAGEMENT_DATE = of("hs_sa_first_engagement_date")

            @JvmField val HS_SA_FIRST_ENGAGEMENT_DESCR = of("hs_sa_first_engagement_descr")

            @JvmField
            val HS_SA_FIRST_ENGAGEMENT_OBJECT_TYPE = of("hs_sa_first_engagement_object_type")

            @JvmField val HS_SALES_EMAIL_LAST_CLICKED = of("hs_sales_email_last_clicked")

            @JvmField val HS_SALES_EMAIL_LAST_OPENED = of("hs_sales_email_last_opened")

            @JvmField val HS_SALES_EMAIL_LAST_REPLIED = of("hs_sales_email_last_replied")

            @JvmField
            val HS_SEARCHABLE_CALCULATED_INTERNATIONAL_MOBILE_NUMBER =
                of("hs_searchable_calculated_international_mobile_number")

            @JvmField
            val HS_SEARCHABLE_CALCULATED_INTERNATIONAL_PHONE_NUMBER =
                of("hs_searchable_calculated_international_phone_number")

            @JvmField
            val HS_SEARCHABLE_CALCULATED_MOBILE_NUMBER =
                of("hs_searchable_calculated_mobile_number")

            @JvmField
            val HS_SEARCHABLE_CALCULATED_PHONE_NUMBER = of("hs_searchable_calculated_phone_number")

            @JvmField val HS_SENIORITY = of("hs_seniority")

            @JvmField
            val HS_SEQUENCES_ACTIVELY_ENROLLED_COUNT = of("hs_sequences_actively_enrolled_count")

            @JvmField val HS_SEQUENCES_ENROLLED_COUNT = of("hs_sequences_enrolled_count")

            @JvmField val HS_SEQUENCES_IS_ENROLLED = of("hs_sequences_is_enrolled")

            @JvmField val HS_SOCIAL_FACEBOOK_CLICKS = of("hs_social_facebook_clicks")

            @JvmField val HS_SOCIAL_GOOGLE_PLUS_CLICKS = of("hs_social_google_plus_clicks")

            @JvmField val HS_SOCIAL_LAST_ENGAGEMENT = of("hs_social_last_engagement")

            @JvmField val HS_SOCIAL_LINKEDIN_CLICKS = of("hs_social_linkedin_clicks")

            @JvmField val HS_SOCIAL_NUM_BROADCAST_CLICKS = of("hs_social_num_broadcast_clicks")

            @JvmField val HS_SOCIAL_TWITTER_CLICKS = of("hs_social_twitter_clicks")

            @JvmField val HS_SOURCE_OBJECT_ID = of("hs_source_object_id")

            @JvmField val HS_SOURCE_PORTAL_ID = of("hs_source_portal_id")

            @JvmField val HS_STATE_CODE = of("hs_state_code")

            @JvmField val HS_SUB_ROLE = of("hs_sub_role")

            @JvmField val HS_TESTPURGE = of("hs_testpurge")

            @JvmField val HS_TESTROLLBACK = of("hs_testrollback")

            @JvmField val HS_TIKTOK_AD_CLICKED = of("hs_tiktok_ad_clicked")

            @JvmField val HS_TIKTOK_CLICK_ID = of("hs_tiktok_click_id")

            @JvmField
            val HS_TIME_BETWEEN_CONTACT_CREATION_AND_DEAL_CLOSE =
                of("hs_time_between_contact_creation_and_deal_close")

            @JvmField
            val HS_TIME_BETWEEN_CONTACT_CREATION_AND_DEAL_CREATION =
                of("hs_time_between_contact_creation_and_deal_creation")

            @JvmField val HS_TIME_IN_CUSTOMER = of("hs_time_in_customer")

            @JvmField val HS_TIME_IN_EVANGELIST = of("hs_time_in_evangelist")

            @JvmField val HS_TIME_IN_LEAD = of("hs_time_in_lead")

            @JvmField
            val HS_TIME_IN_MARKETINGQUALIFIEDLEAD = of("hs_time_in_marketingqualifiedlead")

            @JvmField val HS_TIME_IN_OPPORTUNITY = of("hs_time_in_opportunity")

            @JvmField val HS_TIME_IN_OTHER = of("hs_time_in_other")

            @JvmField val HS_TIME_IN_SALESQUALIFIEDLEAD = of("hs_time_in_salesqualifiedlead")

            @JvmField val HS_TIME_IN_SUBSCRIBER = of("hs_time_in_subscriber")

            @JvmField val HS_TIME_TO_FIRST_ENGAGEMENT = of("hs_time_to_first_engagement")

            @JvmField
            val HS_TIME_TO_MOVE_FROM_LEAD_TO_CUSTOMER = of("hs_time_to_move_from_lead_to_customer")

            @JvmField
            val HS_TIME_TO_MOVE_FROM_MARKETINGQUALIFIEDLEAD_TO_CUSTOMER =
                of("hs_time_to_move_from_marketingqualifiedlead_to_customer")

            @JvmField
            val HS_TIME_TO_MOVE_FROM_OPPORTUNITY_TO_CUSTOMER =
                of("hs_time_to_move_from_opportunity_to_customer")

            @JvmField
            val HS_TIME_TO_MOVE_FROM_SALESQUALIFIEDLEAD_TO_CUSTOMER =
                of("hs_time_to_move_from_salesqualifiedlead_to_customer")

            @JvmField
            val HS_TIME_TO_MOVE_FROM_SUBSCRIBER_TO_CUSTOMER =
                of("hs_time_to_move_from_subscriber_to_customer")

            @JvmField val HS_TIMEZONE = of("hs_timezone")

            @JvmField val HS_TWITTERID = of("hs_twitterid")

            @JvmField
            val HS_V2_CUMULATIVE_TIME_IN_CUSTOMER = of("hs_v2_cumulative_time_in_customer")

            @JvmField
            val HS_V2_CUMULATIVE_TIME_IN_EVANGELIST = of("hs_v2_cumulative_time_in_evangelist")

            @JvmField val HS_V2_CUMULATIVE_TIME_IN_LEAD = of("hs_v2_cumulative_time_in_lead")

            @JvmField
            val HS_V2_CUMULATIVE_TIME_IN_MARKETINGQUALIFIEDLEAD =
                of("hs_v2_cumulative_time_in_marketingqualifiedlead")

            @JvmField
            val HS_V2_CUMULATIVE_TIME_IN_OPPORTUNITY = of("hs_v2_cumulative_time_in_opportunity")

            @JvmField val HS_V2_CUMULATIVE_TIME_IN_OTHER = of("hs_v2_cumulative_time_in_other")

            @JvmField
            val HS_V2_CUMULATIVE_TIME_IN_SALESQUALIFIEDLEAD =
                of("hs_v2_cumulative_time_in_salesqualifiedlead")

            @JvmField
            val HS_V2_CUMULATIVE_TIME_IN_SUBSCRIBER = of("hs_v2_cumulative_time_in_subscriber")

            @JvmField val HS_V2_DATE_ENTERED_CURRENT_STAGE = of("hs_v2_date_entered_current_stage")

            @JvmField val HS_V2_DATE_ENTERED_CUSTOMER = of("hs_v2_date_entered_customer")

            @JvmField val HS_V2_DATE_ENTERED_EVANGELIST = of("hs_v2_date_entered_evangelist")

            @JvmField val HS_V2_DATE_ENTERED_LEAD = of("hs_v2_date_entered_lead")

            @JvmField
            val HS_V2_DATE_ENTERED_MARKETINGQUALIFIEDLEAD =
                of("hs_v2_date_entered_marketingqualifiedlead")

            @JvmField val HS_V2_DATE_ENTERED_OPPORTUNITY = of("hs_v2_date_entered_opportunity")

            @JvmField val HS_V2_DATE_ENTERED_OTHER = of("hs_v2_date_entered_other")

            @JvmField
            val HS_V2_DATE_ENTERED_SALESQUALIFIEDLEAD = of("hs_v2_date_entered_salesqualifiedlead")

            @JvmField val HS_V2_DATE_ENTERED_SUBSCRIBER = of("hs_v2_date_entered_subscriber")

            @JvmField val HS_V2_DATE_EXITED_CUSTOMER = of("hs_v2_date_exited_customer")

            @JvmField val HS_V2_DATE_EXITED_EVANGELIST = of("hs_v2_date_exited_evangelist")

            @JvmField val HS_V2_DATE_EXITED_LEAD = of("hs_v2_date_exited_lead")

            @JvmField
            val HS_V2_DATE_EXITED_MARKETINGQUALIFIEDLEAD =
                of("hs_v2_date_exited_marketingqualifiedlead")

            @JvmField val HS_V2_DATE_EXITED_OPPORTUNITY = of("hs_v2_date_exited_opportunity")

            @JvmField val HS_V2_DATE_EXITED_OTHER = of("hs_v2_date_exited_other")

            @JvmField
            val HS_V2_DATE_EXITED_SALESQUALIFIEDLEAD = of("hs_v2_date_exited_salesqualifiedlead")

            @JvmField val HS_V2_DATE_EXITED_SUBSCRIBER = of("hs_v2_date_exited_subscriber")

            @JvmField val HS_V2_LATEST_TIME_IN_CUSTOMER = of("hs_v2_latest_time_in_customer")

            @JvmField val HS_V2_LATEST_TIME_IN_EVANGELIST = of("hs_v2_latest_time_in_evangelist")

            @JvmField val HS_V2_LATEST_TIME_IN_LEAD = of("hs_v2_latest_time_in_lead")

            @JvmField
            val HS_V2_LATEST_TIME_IN_MARKETINGQUALIFIEDLEAD =
                of("hs_v2_latest_time_in_marketingqualifiedlead")

            @JvmField val HS_V2_LATEST_TIME_IN_OPPORTUNITY = of("hs_v2_latest_time_in_opportunity")

            @JvmField val HS_V2_LATEST_TIME_IN_OTHER = of("hs_v2_latest_time_in_other")

            @JvmField
            val HS_V2_LATEST_TIME_IN_SALESQUALIFIEDLEAD =
                of("hs_v2_latest_time_in_salesqualifiedlead")

            @JvmField val HS_V2_LATEST_TIME_IN_SUBSCRIBER = of("hs_v2_latest_time_in_subscriber")

            @JvmField val HS_V2_TIME_IN_CURRENT_STAGE = of("hs_v2_time_in_current_stage")

            @JvmField val HS_WHATSAPP_PHONE_NUMBER = of("hs_whatsapp_phone_number")

            @JvmField val HUBSPOT_OWNER_ID = of("hubspot_owner_id")

            @JvmField val HUBSPOTSCORE = of("hubspotscore")

            @JvmField val INDUSTRY = of("industry")

            @JvmField val IP_CITY = of("ip_city")

            @JvmField val IP_COUNTRY = of("ip_country")

            @JvmField val IP_COUNTRY_CODE = of("ip_country_code")

            @JvmField val IP_LATLON = of("ip_latlon")

            @JvmField val IP_STATE = of("ip_state")

            @JvmField val IP_STATE_CODE = of("ip_state_code")

            @JvmField val IP_ZIPCODE = of("ip_zipcode")

            @JvmField val JOB_FUNCTION = of("job_function")

            @JvmField val JOBTITLE = of("jobtitle")

            @JvmField val KLOUTSCOREGENERAL = of("kloutscoregeneral")

            @JvmField val LASTMODIFIEDDATE = of("lastmodifieddate")

            @JvmField val LASTNAME = of("lastname")

            @JvmField val LIFECYCLESTAGE = of("lifecyclestage")

            @JvmField val LINKEDINBIO = of("linkedinbio")

            @JvmField val LINKEDINCONNECTIONS = of("linkedinconnections")

            @JvmField val MARITAL_STATUS = of("marital_status")

            @JvmField val MESSAGE = of("message")

            @JvmField val MILITARY_STATUS = of("military_status")

            @JvmField val MOBILEPHONE = of("mobilephone")

            @JvmField val NOTES_LAST_CONTACTED = of("notes_last_contacted")

            @JvmField val NOTES_LAST_UPDATED = of("notes_last_updated")

            @JvmField val NOTES_NEXT_ACTIVITY_DATE = of("notes_next_activity_date")

            @JvmField val NUM_ASSOCIATED_DEALS = of("num_associated_deals")

            @JvmField val NUM_CONTACTED_NOTES = of("num_contacted_notes")

            @JvmField val NUM_CONVERSION_EVENTS = of("num_conversion_events")

            @JvmField val NUM_NOTES = of("num_notes")

            @JvmField val NUM_UNIQUE_CONVERSION_EVENTS = of("num_unique_conversion_events")

            @JvmField val NUMEMPLOYEES = of("numemployees")

            @JvmField val OWNEREMAIL = of("owneremail")

            @JvmField val OWNERNAME = of("ownername")

            @JvmField val PHONE = of("phone")

            @JvmField val PHOTO = of("photo")

            @JvmField val RECENT_CONVERSION_DATE = of("recent_conversion_date")

            @JvmField val RECENT_CONVERSION_EVENT_NAME = of("recent_conversion_event_name")

            @JvmField val RECENT_DEAL_AMOUNT = of("recent_deal_amount")

            @JvmField val RECENT_DEAL_CLOSE_DATE = of("recent_deal_close_date")

            @JvmField val RELATIONSHIP_STATUS = of("relationship_status")

            @JvmField val SALUTATION = of("salutation")

            @JvmField val SCHOOL = of("school")

            @JvmField val SENIORITY = of("seniority")

            @JvmField val START_DATE = of("start_date")

            @JvmField val STATE = of("state")

            @JvmField val SURVEYMONKEYEVENTLASTUPDATED = of("surveymonkeyeventlastupdated")

            @JvmField val TOTAL_REVENUE = of("total_revenue")

            @JvmField val TWITTERBIO = of("twitterbio")

            @JvmField val TWITTERHANDLE = of("twitterhandle")

            @JvmField val TWITTERPROFILEPHOTO = of("twitterprofilephoto")

            @JvmField val WEBINAREVENTLASTUPDATED = of("webinareventlastupdated")

            @JvmField val WEBSITE = of("website")

            @JvmField val WORK_EMAIL = of("work_email")

            @JvmField val ZIP = of("zip")

            @JvmStatic fun of(value: String) = ContactPropertiesLeadingToMatch(JsonField.of(value))
        }

        /** An enum containing [ContactPropertiesLeadingToMatch]'s known values. */
        enum class Known {
            ADDRESS,
            ANNUALREVENUE,
            ASSOCIATEDCOMPANYID,
            ASSOCIATEDCOMPANYLASTUPDATED,
            CITY,
            CLOSEDATE,
            COMPANY,
            COMPANY_SIZE,
            COUNTRY,
            CREATEDATE,
            CURRENTLYINWORKFLOW,
            DATE_OF_BIRTH,
            DAYS_TO_CLOSE,
            DEGREE,
            EMAIL,
            ENGAGEMENTS_LAST_MEETING_BOOKED,
            ENGAGEMENTS_LAST_MEETING_BOOKED_CAMPAIGN,
            ENGAGEMENTS_LAST_MEETING_BOOKED_MEDIUM,
            ENGAGEMENTS_LAST_MEETING_BOOKED_SOURCE,
            FAX,
            FIELD_OF_STUDY,
            FIRST_CONVERSION_DATE,
            FIRST_CONVERSION_EVENT_NAME,
            FIRST_DEAL_CREATED_DATE,
            FIRSTNAME,
            FOLLOWERCOUNT,
            GENDER,
            GRADUATION_DATE,
            HS_ADDITIONAL_EMAILS,
            HS_ALL_CONTACT_VIDS,
            HS_ANALYTICS_AVERAGE_PAGE_VIEWS,
            HS_ANALYTICS_FIRST_REFERRER,
            HS_ANALYTICS_FIRST_TIMESTAMP,
            HS_ANALYTICS_FIRST_TOUCH_CONVERTING_CAMPAIGN,
            HS_ANALYTICS_FIRST_URL,
            HS_ANALYTICS_FIRST_VISIT_TIMESTAMP,
            HS_ANALYTICS_LAST_REFERRER,
            HS_ANALYTICS_LAST_TIMESTAMP,
            HS_ANALYTICS_LAST_TOUCH_CONVERTING_CAMPAIGN,
            HS_ANALYTICS_LAST_URL,
            HS_ANALYTICS_LAST_VISIT_TIMESTAMP,
            HS_ANALYTICS_NUM_EVENT_COMPLETIONS,
            HS_ANALYTICS_NUM_PAGE_VIEWS,
            HS_ANALYTICS_NUM_VISITS,
            HS_ANALYTICS_REVENUE,
            HS_ANALYTICS_SOURCE,
            HS_ANALYTICS_SOURCE_COMPOSITE_DATA,
            HS_ANALYTICS_SOURCE_DATA_1,
            HS_ANALYTICS_SOURCE_DATA_2,
            HS_ASSOCIATED_TARGET_ACCOUNTS,
            HS_AVATAR_FILEMANAGER_KEY,
            HS_BING_AD_CLICKED,
            HS_BING_CLICK_ID,
            HS_BUYING_ROLE,
            HS_CALCULATED_FORM_SUBMISSIONS,
            HS_CALCULATED_MERGED_VIDS,
            HS_CALCULATED_MOBILE_NUMBER,
            HS_CALCULATED_PHONE_NUMBER,
            HS_CALCULATED_PHONE_NUMBER_AREA_CODE,
            HS_CALCULATED_PHONE_NUMBER_COUNTRY_CODE,
            HS_CALCULATED_PHONE_NUMBER_REGION_CODE,
            HS_CHAT_ASSISTANT_IQL_DATE,
            HS_CHAT_ASSISTANT_SOURCE,
            HS_CHAT_ASSISTANT_SUMMARY,
            HS_CLICKED_LINKEDIN_AD,
            HS_CONTACT_CREATION_LEGAL_BASIS_SOURCE_INSTANCE_ID,
            HS_CONTACT_ENRICHMENT_OPT_OUT,
            HS_CONTACT_ENRICHMENT_OPT_OUT_TIMESTAMP,
            HS_CONTENT_MEMBERSHIP_EMAIL,
            HS_CONTENT_MEMBERSHIP_EMAIL_CONFIRMED,
            HS_CONTENT_MEMBERSHIP_FOLLOW_UP_ENQUEUED_AT,
            HS_CONTENT_MEMBERSHIP_NOTES,
            HS_CONTENT_MEMBERSHIP_REGISTERED_AT,
            HS_CONTENT_MEMBERSHIP_REGISTRATION_DOMAIN_SENT_TO,
            HS_CONTENT_MEMBERSHIP_REGISTRATION_EMAIL_SENT_AT,
            HS_CONTENT_MEMBERSHIP_STATUS,
            HS_CONVERSATIONS_VISITOR_EMAIL,
            HS_COUNT_IS_UNWORKED,
            HS_COUNT_IS_WORKED,
            HS_COUNTRY_REGION_CODE,
            HS_CREATED_BY_CONVERSATIONS,
            HS_CROSS_ACCOUNT_NOTE,
            HS_CROSS_SELL_OPPORTUNITY,
            HS_CURRENT_CUSTOMER,
            HS_CURRENTLY_ENROLLED_IN_PROSPECTING_AGENT,
            HS_CUSTOMER_AGENT_LEAD_STATUS,
            HS_DATA_PRIVACY_ADS_CONSENT,
            HS_DATE_ENTERED_CUSTOMER,
            HS_DATE_ENTERED_EVANGELIST,
            HS_DATE_ENTERED_LEAD,
            HS_DATE_ENTERED_MARKETINGQUALIFIEDLEAD,
            HS_DATE_ENTERED_OPPORTUNITY,
            HS_DATE_ENTERED_OTHER,
            HS_DATE_ENTERED_SALESQUALIFIEDLEAD,
            HS_DATE_ENTERED_SUBSCRIBER,
            HS_DATE_EXITED_CUSTOMER,
            HS_DATE_EXITED_EVANGELIST,
            HS_DATE_EXITED_LEAD,
            HS_DATE_EXITED_MARKETINGQUALIFIEDLEAD,
            HS_DATE_EXITED_OPPORTUNITY,
            HS_DATE_EXITED_OTHER,
            HS_DATE_EXITED_SALESQUALIFIEDLEAD,
            HS_DATE_EXITED_SUBSCRIBER,
            HS_DOCUMENT_LAST_REVISITED,
            HS_EMAIL_BAD_ADDRESS,
            HS_EMAIL_BOUNCE,
            HS_EMAIL_CLICK,
            HS_EMAIL_CUSTOMER_QUARANTINED_REASON,
            HS_EMAIL_DELIVERED,
            HS_EMAIL_DOMAIN,
            HS_EMAIL_FIRST_CLICK_DATE,
            HS_EMAIL_FIRST_OPEN_DATE,
            HS_EMAIL_FIRST_REPLY_DATE,
            HS_EMAIL_FIRST_SEND_DATE,
            HS_EMAIL_HARD_BOUNCE_REASON,
            HS_EMAIL_HARD_BOUNCE_REASON_ENUM,
            HS_EMAIL_IS_INELIGIBLE,
            HS_EMAIL_LAST_CLICK_DATE,
            HS_EMAIL_LAST_EMAIL_NAME,
            HS_EMAIL_LAST_OPEN_DATE,
            HS_EMAIL_LAST_REPLY_DATE,
            HS_EMAIL_LAST_SEND_DATE,
            HS_EMAIL_LIVE_SOURCING_RESTRICTED,
            HS_EMAIL_OPEN,
            HS_EMAIL_OPTIMAL_SEND_DAY_OF_WEEK,
            HS_EMAIL_OPTIMAL_SEND_TIME_OF_DAY,
            HS_EMAIL_OPTOUT,
            HS_EMAIL_OPTOUT_SURVEY_REASON,
            HS_EMAIL_QUARANTINED,
            HS_EMAIL_QUARANTINED_REASON,
            HS_EMAIL_RECIPIENT_FATIGUE_RECOVERY_TIME,
            HS_EMAIL_REPLIED,
            HS_EMAIL_SENDS_SINCE_LAST_ENGAGEMENT,
            HS_EMAIL_TYPE,
            HS_EMAILCONFIRMATIONSTATUS,
            HS_EMPLOYMENT_CHANGE_DETECTED_DATE,
            HS_ENRICHED_EMAIL_BOUNCE_DETECTED,
            HS_FACEBOOK_AD_CLICKED,
            HS_FACEBOOK_CLICK_ID,
            HS_FACEBOOKID,
            HS_FEEDBACK_LAST_CES_SURVEY_DATE,
            HS_FEEDBACK_LAST_CES_SURVEY_FOLLOW_UP,
            HS_FEEDBACK_LAST_CES_SURVEY_RATING,
            HS_FEEDBACK_LAST_CSAT_SURVEY_DATE,
            HS_FEEDBACK_LAST_CSAT_SURVEY_FOLLOW_UP,
            HS_FEEDBACK_LAST_CSAT_SURVEY_RATING,
            HS_FEEDBACK_LAST_NPS_FOLLOW_UP,
            HS_FEEDBACK_LAST_NPS_RATING,
            HS_FEEDBACK_LAST_NPS_RATING_NUMBER,
            HS_FEEDBACK_LAST_SURVEY_DATE,
            HS_FEEDBACK_SHOW_NPS_WEB_SURVEY,
            HS_FIRST_CLOSED_ORDER_ID,
            HS_FIRST_ENGAGEMENT_OBJECT_ID,
            HS_FIRST_ORDER_CLOSED_DATE,
            HS_FIRST_OUTREACH_DATE,
            HS_FIRST_SUBSCRIPTION_CREATE_DATE,
            HS_FULL_NAME_OR_EMAIL,
            HS_GOOGLE_CLICK_ID,
            HS_GOOGLEPLUSID,
            HS_GPS_COORDINATES,
            HS_GPS_ERROR,
            HS_GPS_LATITUDE,
            HS_GPS_LONGITUDE,
            HS_HAS_ACTIVE_SUBSCRIPTION,
            HS_INFERRED_LANGUAGE_CODES,
            HS_INTENT_PAID_UP_TO_DATE,
            HS_INTENT_SIGNALS_ENABLED,
            HS_IP_TIMEZONE,
            HS_IS_CONTACT,
            HS_IS_ENRICHED,
            HS_IS_MERGE_REVERTIBLE,
            HS_IS_UNWORKED,
            HS_JOB_CHANGE_DETECTED_DATE,
            HS_JOURNEY_STAGE,
            HS_LANGUAGE,
            HS_LAST_METERED_ENRICHMENT_TIMESTAMP,
            HS_LAST_SALES_ACTIVITY_DATE,
            HS_LAST_SALES_ACTIVITY_TIMESTAMP,
            HS_LAST_SALES_ACTIVITY_TYPE,
            HS_LAST_SMS_SEND_DATE,
            HS_LAST_SMS_SEND_NAME,
            HS_LATEST_DISQUALIFIED_LEAD_DATE,
            HS_LATEST_MEETING_ACTIVITY,
            HS_LATEST_OPEN_LEAD_DATE,
            HS_LATEST_QUALIFIED_LEAD_DATE,
            HS_LATEST_SEQUENCE_ENDED_DATE,
            HS_LATEST_SEQUENCE_ENROLLED,
            HS_LATEST_SEQUENCE_ENROLLED_DATE,
            HS_LATEST_SEQUENCE_FINISHED_DATE,
            HS_LATEST_SEQUENCE_UNENROLLED_DATE,
            HS_LATEST_SOURCE,
            HS_LATEST_SOURCE_COMPOSITE_DATA,
            HS_LATEST_SOURCE_DATA_1,
            HS_LATEST_SOURCE_DATA_2,
            HS_LATEST_SOURCE_TIMESTAMP,
            HS_LATEST_SUBSCRIPTION_CREATE_DATE,
            HS_LATITUDE,
            HS_LEAD_STATUS,
            HS_LEGAL_BASIS,
            HS_LIFECYCLESTAGE_CUSTOMER_DATE,
            HS_LIFECYCLESTAGE_EVANGELIST_DATE,
            HS_LIFECYCLESTAGE_LEAD_DATE,
            HS_LIFECYCLESTAGE_MARKETINGQUALIFIEDLEAD_DATE,
            HS_LIFECYCLESTAGE_OPPORTUNITY_DATE,
            HS_LIFECYCLESTAGE_OTHER_DATE,
            HS_LIFECYCLESTAGE_SALESQUALIFIEDLEAD_DATE,
            HS_LIFECYCLESTAGE_SUBSCRIBER_DATE,
            HS_LINKEDIN_AD_CLICKED,
            HS_LINKEDIN_CLICK_ID,
            HS_LINKEDIN_URL,
            HS_LINKEDINID,
            HS_LIVE_ENRICHMENT_DEADLINE,
            HS_LONGITUDE,
            HS_MANUAL_CAMPAIGN_IDS,
            HS_MARKETABLE_REASON_ID,
            HS_MARKETABLE_REASON_TYPE,
            HS_MARKETABLE_STATUS,
            HS_MARKETABLE_UNTIL_RENEWAL,
            HS_MEMBERSHIP_HAS_ACCESSED_PRIVATE_CONTENT,
            HS_MEMBERSHIP_LAST_PRIVATE_CONTENT_ACCESS_DATE,
            HS_MESSAGING_ENGAGEMENT_SCORE,
            HS_MOBILE_SDK_PUSH_TOKENS,
            HS_NOTES_LAST_ACTIVITY,
            HS_NOTES_NEXT_ACTIVITY,
            HS_NOTES_NEXT_ACTIVITY_TYPE,
            HS_PERSONA,
            HS_PINNED_ENGAGEMENT_ID,
            HS_PIPELINE,
            HS_PREDICTIVECONTACTSCORE,
            HS_PREDICTIVECONTACTSCORE_TMP,
            HS_PREDICTIVECONTACTSCORE_V2,
            HS_PREDICTIVECONTACTSCOREBUCKET,
            HS_PREDICTIVESCORINGTIER,
            HS_PREDICTIVESCORINGTIER_TMP,
            HS_PROSPECTING_AGENT_ACTIVELY_ENROLLED_COUNT,
            HS_PROSPECTING_AGENT_LAST_ENROLLED,
            HS_PROSPECTING_AGENT_TOTAL_ENROLLED_COUNT,
            HS_QUARANTINED_EMAILS,
            HS_RECENT_CLOSED_ORDER_DATE,
            HS_REGISTERED_MEMBER,
            HS_REGISTRATION_METHOD,
            HS_RETURNING_TO_OFFICE_DETECTED_DATE,
            HS_ROLE,
            HS_SA_FIRST_ENGAGEMENT_DATE,
            HS_SA_FIRST_ENGAGEMENT_DESCR,
            HS_SA_FIRST_ENGAGEMENT_OBJECT_TYPE,
            HS_SALES_EMAIL_LAST_CLICKED,
            HS_SALES_EMAIL_LAST_OPENED,
            HS_SALES_EMAIL_LAST_REPLIED,
            HS_SEARCHABLE_CALCULATED_INTERNATIONAL_MOBILE_NUMBER,
            HS_SEARCHABLE_CALCULATED_INTERNATIONAL_PHONE_NUMBER,
            HS_SEARCHABLE_CALCULATED_MOBILE_NUMBER,
            HS_SEARCHABLE_CALCULATED_PHONE_NUMBER,
            HS_SENIORITY,
            HS_SEQUENCES_ACTIVELY_ENROLLED_COUNT,
            HS_SEQUENCES_ENROLLED_COUNT,
            HS_SEQUENCES_IS_ENROLLED,
            HS_SOCIAL_FACEBOOK_CLICKS,
            HS_SOCIAL_GOOGLE_PLUS_CLICKS,
            HS_SOCIAL_LAST_ENGAGEMENT,
            HS_SOCIAL_LINKEDIN_CLICKS,
            HS_SOCIAL_NUM_BROADCAST_CLICKS,
            HS_SOCIAL_TWITTER_CLICKS,
            HS_SOURCE_OBJECT_ID,
            HS_SOURCE_PORTAL_ID,
            HS_STATE_CODE,
            HS_SUB_ROLE,
            HS_TESTPURGE,
            HS_TESTROLLBACK,
            HS_TIKTOK_AD_CLICKED,
            HS_TIKTOK_CLICK_ID,
            HS_TIME_BETWEEN_CONTACT_CREATION_AND_DEAL_CLOSE,
            HS_TIME_BETWEEN_CONTACT_CREATION_AND_DEAL_CREATION,
            HS_TIME_IN_CUSTOMER,
            HS_TIME_IN_EVANGELIST,
            HS_TIME_IN_LEAD,
            HS_TIME_IN_MARKETINGQUALIFIEDLEAD,
            HS_TIME_IN_OPPORTUNITY,
            HS_TIME_IN_OTHER,
            HS_TIME_IN_SALESQUALIFIEDLEAD,
            HS_TIME_IN_SUBSCRIBER,
            HS_TIME_TO_FIRST_ENGAGEMENT,
            HS_TIME_TO_MOVE_FROM_LEAD_TO_CUSTOMER,
            HS_TIME_TO_MOVE_FROM_MARKETINGQUALIFIEDLEAD_TO_CUSTOMER,
            HS_TIME_TO_MOVE_FROM_OPPORTUNITY_TO_CUSTOMER,
            HS_TIME_TO_MOVE_FROM_SALESQUALIFIEDLEAD_TO_CUSTOMER,
            HS_TIME_TO_MOVE_FROM_SUBSCRIBER_TO_CUSTOMER,
            HS_TIMEZONE,
            HS_TWITTERID,
            HS_V2_CUMULATIVE_TIME_IN_CUSTOMER,
            HS_V2_CUMULATIVE_TIME_IN_EVANGELIST,
            HS_V2_CUMULATIVE_TIME_IN_LEAD,
            HS_V2_CUMULATIVE_TIME_IN_MARKETINGQUALIFIEDLEAD,
            HS_V2_CUMULATIVE_TIME_IN_OPPORTUNITY,
            HS_V2_CUMULATIVE_TIME_IN_OTHER,
            HS_V2_CUMULATIVE_TIME_IN_SALESQUALIFIEDLEAD,
            HS_V2_CUMULATIVE_TIME_IN_SUBSCRIBER,
            HS_V2_DATE_ENTERED_CURRENT_STAGE,
            HS_V2_DATE_ENTERED_CUSTOMER,
            HS_V2_DATE_ENTERED_EVANGELIST,
            HS_V2_DATE_ENTERED_LEAD,
            HS_V2_DATE_ENTERED_MARKETINGQUALIFIEDLEAD,
            HS_V2_DATE_ENTERED_OPPORTUNITY,
            HS_V2_DATE_ENTERED_OTHER,
            HS_V2_DATE_ENTERED_SALESQUALIFIEDLEAD,
            HS_V2_DATE_ENTERED_SUBSCRIBER,
            HS_V2_DATE_EXITED_CUSTOMER,
            HS_V2_DATE_EXITED_EVANGELIST,
            HS_V2_DATE_EXITED_LEAD,
            HS_V2_DATE_EXITED_MARKETINGQUALIFIEDLEAD,
            HS_V2_DATE_EXITED_OPPORTUNITY,
            HS_V2_DATE_EXITED_OTHER,
            HS_V2_DATE_EXITED_SALESQUALIFIEDLEAD,
            HS_V2_DATE_EXITED_SUBSCRIBER,
            HS_V2_LATEST_TIME_IN_CUSTOMER,
            HS_V2_LATEST_TIME_IN_EVANGELIST,
            HS_V2_LATEST_TIME_IN_LEAD,
            HS_V2_LATEST_TIME_IN_MARKETINGQUALIFIEDLEAD,
            HS_V2_LATEST_TIME_IN_OPPORTUNITY,
            HS_V2_LATEST_TIME_IN_OTHER,
            HS_V2_LATEST_TIME_IN_SALESQUALIFIEDLEAD,
            HS_V2_LATEST_TIME_IN_SUBSCRIBER,
            HS_V2_TIME_IN_CURRENT_STAGE,
            HS_WHATSAPP_PHONE_NUMBER,
            HUBSPOT_OWNER_ID,
            HUBSPOTSCORE,
            INDUSTRY,
            IP_CITY,
            IP_COUNTRY,
            IP_COUNTRY_CODE,
            IP_LATLON,
            IP_STATE,
            IP_STATE_CODE,
            IP_ZIPCODE,
            JOB_FUNCTION,
            JOBTITLE,
            KLOUTSCOREGENERAL,
            LASTMODIFIEDDATE,
            LASTNAME,
            LIFECYCLESTAGE,
            LINKEDINBIO,
            LINKEDINCONNECTIONS,
            MARITAL_STATUS,
            MESSAGE,
            MILITARY_STATUS,
            MOBILEPHONE,
            NOTES_LAST_CONTACTED,
            NOTES_LAST_UPDATED,
            NOTES_NEXT_ACTIVITY_DATE,
            NUM_ASSOCIATED_DEALS,
            NUM_CONTACTED_NOTES,
            NUM_CONVERSION_EVENTS,
            NUM_NOTES,
            NUM_UNIQUE_CONVERSION_EVENTS,
            NUMEMPLOYEES,
            OWNEREMAIL,
            OWNERNAME,
            PHONE,
            PHOTO,
            RECENT_CONVERSION_DATE,
            RECENT_CONVERSION_EVENT_NAME,
            RECENT_DEAL_AMOUNT,
            RECENT_DEAL_CLOSE_DATE,
            RELATIONSHIP_STATUS,
            SALUTATION,
            SCHOOL,
            SENIORITY,
            START_DATE,
            STATE,
            SURVEYMONKEYEVENTLASTUPDATED,
            TOTAL_REVENUE,
            TWITTERBIO,
            TWITTERHANDLE,
            TWITTERPROFILEPHOTO,
            WEBINAREVENTLASTUPDATED,
            WEBSITE,
            WORK_EMAIL,
            ZIP,
        }

        /**
         * An enum containing [ContactPropertiesLeadingToMatch]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [ContactPropertiesLeadingToMatch] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ADDRESS,
            ANNUALREVENUE,
            ASSOCIATEDCOMPANYID,
            ASSOCIATEDCOMPANYLASTUPDATED,
            CITY,
            CLOSEDATE,
            COMPANY,
            COMPANY_SIZE,
            COUNTRY,
            CREATEDATE,
            CURRENTLYINWORKFLOW,
            DATE_OF_BIRTH,
            DAYS_TO_CLOSE,
            DEGREE,
            EMAIL,
            ENGAGEMENTS_LAST_MEETING_BOOKED,
            ENGAGEMENTS_LAST_MEETING_BOOKED_CAMPAIGN,
            ENGAGEMENTS_LAST_MEETING_BOOKED_MEDIUM,
            ENGAGEMENTS_LAST_MEETING_BOOKED_SOURCE,
            FAX,
            FIELD_OF_STUDY,
            FIRST_CONVERSION_DATE,
            FIRST_CONVERSION_EVENT_NAME,
            FIRST_DEAL_CREATED_DATE,
            FIRSTNAME,
            FOLLOWERCOUNT,
            GENDER,
            GRADUATION_DATE,
            HS_ADDITIONAL_EMAILS,
            HS_ALL_CONTACT_VIDS,
            HS_ANALYTICS_AVERAGE_PAGE_VIEWS,
            HS_ANALYTICS_FIRST_REFERRER,
            HS_ANALYTICS_FIRST_TIMESTAMP,
            HS_ANALYTICS_FIRST_TOUCH_CONVERTING_CAMPAIGN,
            HS_ANALYTICS_FIRST_URL,
            HS_ANALYTICS_FIRST_VISIT_TIMESTAMP,
            HS_ANALYTICS_LAST_REFERRER,
            HS_ANALYTICS_LAST_TIMESTAMP,
            HS_ANALYTICS_LAST_TOUCH_CONVERTING_CAMPAIGN,
            HS_ANALYTICS_LAST_URL,
            HS_ANALYTICS_LAST_VISIT_TIMESTAMP,
            HS_ANALYTICS_NUM_EVENT_COMPLETIONS,
            HS_ANALYTICS_NUM_PAGE_VIEWS,
            HS_ANALYTICS_NUM_VISITS,
            HS_ANALYTICS_REVENUE,
            HS_ANALYTICS_SOURCE,
            HS_ANALYTICS_SOURCE_COMPOSITE_DATA,
            HS_ANALYTICS_SOURCE_DATA_1,
            HS_ANALYTICS_SOURCE_DATA_2,
            HS_ASSOCIATED_TARGET_ACCOUNTS,
            HS_AVATAR_FILEMANAGER_KEY,
            HS_BING_AD_CLICKED,
            HS_BING_CLICK_ID,
            HS_BUYING_ROLE,
            HS_CALCULATED_FORM_SUBMISSIONS,
            HS_CALCULATED_MERGED_VIDS,
            HS_CALCULATED_MOBILE_NUMBER,
            HS_CALCULATED_PHONE_NUMBER,
            HS_CALCULATED_PHONE_NUMBER_AREA_CODE,
            HS_CALCULATED_PHONE_NUMBER_COUNTRY_CODE,
            HS_CALCULATED_PHONE_NUMBER_REGION_CODE,
            HS_CHAT_ASSISTANT_IQL_DATE,
            HS_CHAT_ASSISTANT_SOURCE,
            HS_CHAT_ASSISTANT_SUMMARY,
            HS_CLICKED_LINKEDIN_AD,
            HS_CONTACT_CREATION_LEGAL_BASIS_SOURCE_INSTANCE_ID,
            HS_CONTACT_ENRICHMENT_OPT_OUT,
            HS_CONTACT_ENRICHMENT_OPT_OUT_TIMESTAMP,
            HS_CONTENT_MEMBERSHIP_EMAIL,
            HS_CONTENT_MEMBERSHIP_EMAIL_CONFIRMED,
            HS_CONTENT_MEMBERSHIP_FOLLOW_UP_ENQUEUED_AT,
            HS_CONTENT_MEMBERSHIP_NOTES,
            HS_CONTENT_MEMBERSHIP_REGISTERED_AT,
            HS_CONTENT_MEMBERSHIP_REGISTRATION_DOMAIN_SENT_TO,
            HS_CONTENT_MEMBERSHIP_REGISTRATION_EMAIL_SENT_AT,
            HS_CONTENT_MEMBERSHIP_STATUS,
            HS_CONVERSATIONS_VISITOR_EMAIL,
            HS_COUNT_IS_UNWORKED,
            HS_COUNT_IS_WORKED,
            HS_COUNTRY_REGION_CODE,
            HS_CREATED_BY_CONVERSATIONS,
            HS_CROSS_ACCOUNT_NOTE,
            HS_CROSS_SELL_OPPORTUNITY,
            HS_CURRENT_CUSTOMER,
            HS_CURRENTLY_ENROLLED_IN_PROSPECTING_AGENT,
            HS_CUSTOMER_AGENT_LEAD_STATUS,
            HS_DATA_PRIVACY_ADS_CONSENT,
            HS_DATE_ENTERED_CUSTOMER,
            HS_DATE_ENTERED_EVANGELIST,
            HS_DATE_ENTERED_LEAD,
            HS_DATE_ENTERED_MARKETINGQUALIFIEDLEAD,
            HS_DATE_ENTERED_OPPORTUNITY,
            HS_DATE_ENTERED_OTHER,
            HS_DATE_ENTERED_SALESQUALIFIEDLEAD,
            HS_DATE_ENTERED_SUBSCRIBER,
            HS_DATE_EXITED_CUSTOMER,
            HS_DATE_EXITED_EVANGELIST,
            HS_DATE_EXITED_LEAD,
            HS_DATE_EXITED_MARKETINGQUALIFIEDLEAD,
            HS_DATE_EXITED_OPPORTUNITY,
            HS_DATE_EXITED_OTHER,
            HS_DATE_EXITED_SALESQUALIFIEDLEAD,
            HS_DATE_EXITED_SUBSCRIBER,
            HS_DOCUMENT_LAST_REVISITED,
            HS_EMAIL_BAD_ADDRESS,
            HS_EMAIL_BOUNCE,
            HS_EMAIL_CLICK,
            HS_EMAIL_CUSTOMER_QUARANTINED_REASON,
            HS_EMAIL_DELIVERED,
            HS_EMAIL_DOMAIN,
            HS_EMAIL_FIRST_CLICK_DATE,
            HS_EMAIL_FIRST_OPEN_DATE,
            HS_EMAIL_FIRST_REPLY_DATE,
            HS_EMAIL_FIRST_SEND_DATE,
            HS_EMAIL_HARD_BOUNCE_REASON,
            HS_EMAIL_HARD_BOUNCE_REASON_ENUM,
            HS_EMAIL_IS_INELIGIBLE,
            HS_EMAIL_LAST_CLICK_DATE,
            HS_EMAIL_LAST_EMAIL_NAME,
            HS_EMAIL_LAST_OPEN_DATE,
            HS_EMAIL_LAST_REPLY_DATE,
            HS_EMAIL_LAST_SEND_DATE,
            HS_EMAIL_LIVE_SOURCING_RESTRICTED,
            HS_EMAIL_OPEN,
            HS_EMAIL_OPTIMAL_SEND_DAY_OF_WEEK,
            HS_EMAIL_OPTIMAL_SEND_TIME_OF_DAY,
            HS_EMAIL_OPTOUT,
            HS_EMAIL_OPTOUT_SURVEY_REASON,
            HS_EMAIL_QUARANTINED,
            HS_EMAIL_QUARANTINED_REASON,
            HS_EMAIL_RECIPIENT_FATIGUE_RECOVERY_TIME,
            HS_EMAIL_REPLIED,
            HS_EMAIL_SENDS_SINCE_LAST_ENGAGEMENT,
            HS_EMAIL_TYPE,
            HS_EMAILCONFIRMATIONSTATUS,
            HS_EMPLOYMENT_CHANGE_DETECTED_DATE,
            HS_ENRICHED_EMAIL_BOUNCE_DETECTED,
            HS_FACEBOOK_AD_CLICKED,
            HS_FACEBOOK_CLICK_ID,
            HS_FACEBOOKID,
            HS_FEEDBACK_LAST_CES_SURVEY_DATE,
            HS_FEEDBACK_LAST_CES_SURVEY_FOLLOW_UP,
            HS_FEEDBACK_LAST_CES_SURVEY_RATING,
            HS_FEEDBACK_LAST_CSAT_SURVEY_DATE,
            HS_FEEDBACK_LAST_CSAT_SURVEY_FOLLOW_UP,
            HS_FEEDBACK_LAST_CSAT_SURVEY_RATING,
            HS_FEEDBACK_LAST_NPS_FOLLOW_UP,
            HS_FEEDBACK_LAST_NPS_RATING,
            HS_FEEDBACK_LAST_NPS_RATING_NUMBER,
            HS_FEEDBACK_LAST_SURVEY_DATE,
            HS_FEEDBACK_SHOW_NPS_WEB_SURVEY,
            HS_FIRST_CLOSED_ORDER_ID,
            HS_FIRST_ENGAGEMENT_OBJECT_ID,
            HS_FIRST_ORDER_CLOSED_DATE,
            HS_FIRST_OUTREACH_DATE,
            HS_FIRST_SUBSCRIPTION_CREATE_DATE,
            HS_FULL_NAME_OR_EMAIL,
            HS_GOOGLE_CLICK_ID,
            HS_GOOGLEPLUSID,
            HS_GPS_COORDINATES,
            HS_GPS_ERROR,
            HS_GPS_LATITUDE,
            HS_GPS_LONGITUDE,
            HS_HAS_ACTIVE_SUBSCRIPTION,
            HS_INFERRED_LANGUAGE_CODES,
            HS_INTENT_PAID_UP_TO_DATE,
            HS_INTENT_SIGNALS_ENABLED,
            HS_IP_TIMEZONE,
            HS_IS_CONTACT,
            HS_IS_ENRICHED,
            HS_IS_MERGE_REVERTIBLE,
            HS_IS_UNWORKED,
            HS_JOB_CHANGE_DETECTED_DATE,
            HS_JOURNEY_STAGE,
            HS_LANGUAGE,
            HS_LAST_METERED_ENRICHMENT_TIMESTAMP,
            HS_LAST_SALES_ACTIVITY_DATE,
            HS_LAST_SALES_ACTIVITY_TIMESTAMP,
            HS_LAST_SALES_ACTIVITY_TYPE,
            HS_LAST_SMS_SEND_DATE,
            HS_LAST_SMS_SEND_NAME,
            HS_LATEST_DISQUALIFIED_LEAD_DATE,
            HS_LATEST_MEETING_ACTIVITY,
            HS_LATEST_OPEN_LEAD_DATE,
            HS_LATEST_QUALIFIED_LEAD_DATE,
            HS_LATEST_SEQUENCE_ENDED_DATE,
            HS_LATEST_SEQUENCE_ENROLLED,
            HS_LATEST_SEQUENCE_ENROLLED_DATE,
            HS_LATEST_SEQUENCE_FINISHED_DATE,
            HS_LATEST_SEQUENCE_UNENROLLED_DATE,
            HS_LATEST_SOURCE,
            HS_LATEST_SOURCE_COMPOSITE_DATA,
            HS_LATEST_SOURCE_DATA_1,
            HS_LATEST_SOURCE_DATA_2,
            HS_LATEST_SOURCE_TIMESTAMP,
            HS_LATEST_SUBSCRIPTION_CREATE_DATE,
            HS_LATITUDE,
            HS_LEAD_STATUS,
            HS_LEGAL_BASIS,
            HS_LIFECYCLESTAGE_CUSTOMER_DATE,
            HS_LIFECYCLESTAGE_EVANGELIST_DATE,
            HS_LIFECYCLESTAGE_LEAD_DATE,
            HS_LIFECYCLESTAGE_MARKETINGQUALIFIEDLEAD_DATE,
            HS_LIFECYCLESTAGE_OPPORTUNITY_DATE,
            HS_LIFECYCLESTAGE_OTHER_DATE,
            HS_LIFECYCLESTAGE_SALESQUALIFIEDLEAD_DATE,
            HS_LIFECYCLESTAGE_SUBSCRIBER_DATE,
            HS_LINKEDIN_AD_CLICKED,
            HS_LINKEDIN_CLICK_ID,
            HS_LINKEDIN_URL,
            HS_LINKEDINID,
            HS_LIVE_ENRICHMENT_DEADLINE,
            HS_LONGITUDE,
            HS_MANUAL_CAMPAIGN_IDS,
            HS_MARKETABLE_REASON_ID,
            HS_MARKETABLE_REASON_TYPE,
            HS_MARKETABLE_STATUS,
            HS_MARKETABLE_UNTIL_RENEWAL,
            HS_MEMBERSHIP_HAS_ACCESSED_PRIVATE_CONTENT,
            HS_MEMBERSHIP_LAST_PRIVATE_CONTENT_ACCESS_DATE,
            HS_MESSAGING_ENGAGEMENT_SCORE,
            HS_MOBILE_SDK_PUSH_TOKENS,
            HS_NOTES_LAST_ACTIVITY,
            HS_NOTES_NEXT_ACTIVITY,
            HS_NOTES_NEXT_ACTIVITY_TYPE,
            HS_PERSONA,
            HS_PINNED_ENGAGEMENT_ID,
            HS_PIPELINE,
            HS_PREDICTIVECONTACTSCORE,
            HS_PREDICTIVECONTACTSCORE_TMP,
            HS_PREDICTIVECONTACTSCORE_V2,
            HS_PREDICTIVECONTACTSCOREBUCKET,
            HS_PREDICTIVESCORINGTIER,
            HS_PREDICTIVESCORINGTIER_TMP,
            HS_PROSPECTING_AGENT_ACTIVELY_ENROLLED_COUNT,
            HS_PROSPECTING_AGENT_LAST_ENROLLED,
            HS_PROSPECTING_AGENT_TOTAL_ENROLLED_COUNT,
            HS_QUARANTINED_EMAILS,
            HS_RECENT_CLOSED_ORDER_DATE,
            HS_REGISTERED_MEMBER,
            HS_REGISTRATION_METHOD,
            HS_RETURNING_TO_OFFICE_DETECTED_DATE,
            HS_ROLE,
            HS_SA_FIRST_ENGAGEMENT_DATE,
            HS_SA_FIRST_ENGAGEMENT_DESCR,
            HS_SA_FIRST_ENGAGEMENT_OBJECT_TYPE,
            HS_SALES_EMAIL_LAST_CLICKED,
            HS_SALES_EMAIL_LAST_OPENED,
            HS_SALES_EMAIL_LAST_REPLIED,
            HS_SEARCHABLE_CALCULATED_INTERNATIONAL_MOBILE_NUMBER,
            HS_SEARCHABLE_CALCULATED_INTERNATIONAL_PHONE_NUMBER,
            HS_SEARCHABLE_CALCULATED_MOBILE_NUMBER,
            HS_SEARCHABLE_CALCULATED_PHONE_NUMBER,
            HS_SENIORITY,
            HS_SEQUENCES_ACTIVELY_ENROLLED_COUNT,
            HS_SEQUENCES_ENROLLED_COUNT,
            HS_SEQUENCES_IS_ENROLLED,
            HS_SOCIAL_FACEBOOK_CLICKS,
            HS_SOCIAL_GOOGLE_PLUS_CLICKS,
            HS_SOCIAL_LAST_ENGAGEMENT,
            HS_SOCIAL_LINKEDIN_CLICKS,
            HS_SOCIAL_NUM_BROADCAST_CLICKS,
            HS_SOCIAL_TWITTER_CLICKS,
            HS_SOURCE_OBJECT_ID,
            HS_SOURCE_PORTAL_ID,
            HS_STATE_CODE,
            HS_SUB_ROLE,
            HS_TESTPURGE,
            HS_TESTROLLBACK,
            HS_TIKTOK_AD_CLICKED,
            HS_TIKTOK_CLICK_ID,
            HS_TIME_BETWEEN_CONTACT_CREATION_AND_DEAL_CLOSE,
            HS_TIME_BETWEEN_CONTACT_CREATION_AND_DEAL_CREATION,
            HS_TIME_IN_CUSTOMER,
            HS_TIME_IN_EVANGELIST,
            HS_TIME_IN_LEAD,
            HS_TIME_IN_MARKETINGQUALIFIEDLEAD,
            HS_TIME_IN_OPPORTUNITY,
            HS_TIME_IN_OTHER,
            HS_TIME_IN_SALESQUALIFIEDLEAD,
            HS_TIME_IN_SUBSCRIBER,
            HS_TIME_TO_FIRST_ENGAGEMENT,
            HS_TIME_TO_MOVE_FROM_LEAD_TO_CUSTOMER,
            HS_TIME_TO_MOVE_FROM_MARKETINGQUALIFIEDLEAD_TO_CUSTOMER,
            HS_TIME_TO_MOVE_FROM_OPPORTUNITY_TO_CUSTOMER,
            HS_TIME_TO_MOVE_FROM_SALESQUALIFIEDLEAD_TO_CUSTOMER,
            HS_TIME_TO_MOVE_FROM_SUBSCRIBER_TO_CUSTOMER,
            HS_TIMEZONE,
            HS_TWITTERID,
            HS_V2_CUMULATIVE_TIME_IN_CUSTOMER,
            HS_V2_CUMULATIVE_TIME_IN_EVANGELIST,
            HS_V2_CUMULATIVE_TIME_IN_LEAD,
            HS_V2_CUMULATIVE_TIME_IN_MARKETINGQUALIFIEDLEAD,
            HS_V2_CUMULATIVE_TIME_IN_OPPORTUNITY,
            HS_V2_CUMULATIVE_TIME_IN_OTHER,
            HS_V2_CUMULATIVE_TIME_IN_SALESQUALIFIEDLEAD,
            HS_V2_CUMULATIVE_TIME_IN_SUBSCRIBER,
            HS_V2_DATE_ENTERED_CURRENT_STAGE,
            HS_V2_DATE_ENTERED_CUSTOMER,
            HS_V2_DATE_ENTERED_EVANGELIST,
            HS_V2_DATE_ENTERED_LEAD,
            HS_V2_DATE_ENTERED_MARKETINGQUALIFIEDLEAD,
            HS_V2_DATE_ENTERED_OPPORTUNITY,
            HS_V2_DATE_ENTERED_OTHER,
            HS_V2_DATE_ENTERED_SALESQUALIFIEDLEAD,
            HS_V2_DATE_ENTERED_SUBSCRIBER,
            HS_V2_DATE_EXITED_CUSTOMER,
            HS_V2_DATE_EXITED_EVANGELIST,
            HS_V2_DATE_EXITED_LEAD,
            HS_V2_DATE_EXITED_MARKETINGQUALIFIEDLEAD,
            HS_V2_DATE_EXITED_OPPORTUNITY,
            HS_V2_DATE_EXITED_OTHER,
            HS_V2_DATE_EXITED_SALESQUALIFIEDLEAD,
            HS_V2_DATE_EXITED_SUBSCRIBER,
            HS_V2_LATEST_TIME_IN_CUSTOMER,
            HS_V2_LATEST_TIME_IN_EVANGELIST,
            HS_V2_LATEST_TIME_IN_LEAD,
            HS_V2_LATEST_TIME_IN_MARKETINGQUALIFIEDLEAD,
            HS_V2_LATEST_TIME_IN_OPPORTUNITY,
            HS_V2_LATEST_TIME_IN_OTHER,
            HS_V2_LATEST_TIME_IN_SALESQUALIFIEDLEAD,
            HS_V2_LATEST_TIME_IN_SUBSCRIBER,
            HS_V2_TIME_IN_CURRENT_STAGE,
            HS_WHATSAPP_PHONE_NUMBER,
            HUBSPOT_OWNER_ID,
            HUBSPOTSCORE,
            INDUSTRY,
            IP_CITY,
            IP_COUNTRY,
            IP_COUNTRY_CODE,
            IP_LATLON,
            IP_STATE,
            IP_STATE_CODE,
            IP_ZIPCODE,
            JOB_FUNCTION,
            JOBTITLE,
            KLOUTSCOREGENERAL,
            LASTMODIFIEDDATE,
            LASTNAME,
            LIFECYCLESTAGE,
            LINKEDINBIO,
            LINKEDINCONNECTIONS,
            MARITAL_STATUS,
            MESSAGE,
            MILITARY_STATUS,
            MOBILEPHONE,
            NOTES_LAST_CONTACTED,
            NOTES_LAST_UPDATED,
            NOTES_NEXT_ACTIVITY_DATE,
            NUM_ASSOCIATED_DEALS,
            NUM_CONTACTED_NOTES,
            NUM_CONVERSION_EVENTS,
            NUM_NOTES,
            NUM_UNIQUE_CONVERSION_EVENTS,
            NUMEMPLOYEES,
            OWNEREMAIL,
            OWNERNAME,
            PHONE,
            PHOTO,
            RECENT_CONVERSION_DATE,
            RECENT_CONVERSION_EVENT_NAME,
            RECENT_DEAL_AMOUNT,
            RECENT_DEAL_CLOSE_DATE,
            RELATIONSHIP_STATUS,
            SALUTATION,
            SCHOOL,
            SENIORITY,
            START_DATE,
            STATE,
            SURVEYMONKEYEVENTLASTUPDATED,
            TOTAL_REVENUE,
            TWITTERBIO,
            TWITTERHANDLE,
            TWITTERPROFILEPHOTO,
            WEBINAREVENTLASTUPDATED,
            WEBSITE,
            WORK_EMAIL,
            ZIP,
            /**
             * An enum member indicating that [ContactPropertiesLeadingToMatch] was instantiated
             * with an unknown value.
             */
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
                ADDRESS -> Value.ADDRESS
                ANNUALREVENUE -> Value.ANNUALREVENUE
                ASSOCIATEDCOMPANYID -> Value.ASSOCIATEDCOMPANYID
                ASSOCIATEDCOMPANYLASTUPDATED -> Value.ASSOCIATEDCOMPANYLASTUPDATED
                CITY -> Value.CITY
                CLOSEDATE -> Value.CLOSEDATE
                COMPANY -> Value.COMPANY
                COMPANY_SIZE -> Value.COMPANY_SIZE
                COUNTRY -> Value.COUNTRY
                CREATEDATE -> Value.CREATEDATE
                CURRENTLYINWORKFLOW -> Value.CURRENTLYINWORKFLOW
                DATE_OF_BIRTH -> Value.DATE_OF_BIRTH
                DAYS_TO_CLOSE -> Value.DAYS_TO_CLOSE
                DEGREE -> Value.DEGREE
                EMAIL -> Value.EMAIL
                ENGAGEMENTS_LAST_MEETING_BOOKED -> Value.ENGAGEMENTS_LAST_MEETING_BOOKED
                ENGAGEMENTS_LAST_MEETING_BOOKED_CAMPAIGN ->
                    Value.ENGAGEMENTS_LAST_MEETING_BOOKED_CAMPAIGN
                ENGAGEMENTS_LAST_MEETING_BOOKED_MEDIUM ->
                    Value.ENGAGEMENTS_LAST_MEETING_BOOKED_MEDIUM
                ENGAGEMENTS_LAST_MEETING_BOOKED_SOURCE ->
                    Value.ENGAGEMENTS_LAST_MEETING_BOOKED_SOURCE
                FAX -> Value.FAX
                FIELD_OF_STUDY -> Value.FIELD_OF_STUDY
                FIRST_CONVERSION_DATE -> Value.FIRST_CONVERSION_DATE
                FIRST_CONVERSION_EVENT_NAME -> Value.FIRST_CONVERSION_EVENT_NAME
                FIRST_DEAL_CREATED_DATE -> Value.FIRST_DEAL_CREATED_DATE
                FIRSTNAME -> Value.FIRSTNAME
                FOLLOWERCOUNT -> Value.FOLLOWERCOUNT
                GENDER -> Value.GENDER
                GRADUATION_DATE -> Value.GRADUATION_DATE
                HS_ADDITIONAL_EMAILS -> Value.HS_ADDITIONAL_EMAILS
                HS_ALL_CONTACT_VIDS -> Value.HS_ALL_CONTACT_VIDS
                HS_ANALYTICS_AVERAGE_PAGE_VIEWS -> Value.HS_ANALYTICS_AVERAGE_PAGE_VIEWS
                HS_ANALYTICS_FIRST_REFERRER -> Value.HS_ANALYTICS_FIRST_REFERRER
                HS_ANALYTICS_FIRST_TIMESTAMP -> Value.HS_ANALYTICS_FIRST_TIMESTAMP
                HS_ANALYTICS_FIRST_TOUCH_CONVERTING_CAMPAIGN ->
                    Value.HS_ANALYTICS_FIRST_TOUCH_CONVERTING_CAMPAIGN
                HS_ANALYTICS_FIRST_URL -> Value.HS_ANALYTICS_FIRST_URL
                HS_ANALYTICS_FIRST_VISIT_TIMESTAMP -> Value.HS_ANALYTICS_FIRST_VISIT_TIMESTAMP
                HS_ANALYTICS_LAST_REFERRER -> Value.HS_ANALYTICS_LAST_REFERRER
                HS_ANALYTICS_LAST_TIMESTAMP -> Value.HS_ANALYTICS_LAST_TIMESTAMP
                HS_ANALYTICS_LAST_TOUCH_CONVERTING_CAMPAIGN ->
                    Value.HS_ANALYTICS_LAST_TOUCH_CONVERTING_CAMPAIGN
                HS_ANALYTICS_LAST_URL -> Value.HS_ANALYTICS_LAST_URL
                HS_ANALYTICS_LAST_VISIT_TIMESTAMP -> Value.HS_ANALYTICS_LAST_VISIT_TIMESTAMP
                HS_ANALYTICS_NUM_EVENT_COMPLETIONS -> Value.HS_ANALYTICS_NUM_EVENT_COMPLETIONS
                HS_ANALYTICS_NUM_PAGE_VIEWS -> Value.HS_ANALYTICS_NUM_PAGE_VIEWS
                HS_ANALYTICS_NUM_VISITS -> Value.HS_ANALYTICS_NUM_VISITS
                HS_ANALYTICS_REVENUE -> Value.HS_ANALYTICS_REVENUE
                HS_ANALYTICS_SOURCE -> Value.HS_ANALYTICS_SOURCE
                HS_ANALYTICS_SOURCE_COMPOSITE_DATA -> Value.HS_ANALYTICS_SOURCE_COMPOSITE_DATA
                HS_ANALYTICS_SOURCE_DATA_1 -> Value.HS_ANALYTICS_SOURCE_DATA_1
                HS_ANALYTICS_SOURCE_DATA_2 -> Value.HS_ANALYTICS_SOURCE_DATA_2
                HS_ASSOCIATED_TARGET_ACCOUNTS -> Value.HS_ASSOCIATED_TARGET_ACCOUNTS
                HS_AVATAR_FILEMANAGER_KEY -> Value.HS_AVATAR_FILEMANAGER_KEY
                HS_BING_AD_CLICKED -> Value.HS_BING_AD_CLICKED
                HS_BING_CLICK_ID -> Value.HS_BING_CLICK_ID
                HS_BUYING_ROLE -> Value.HS_BUYING_ROLE
                HS_CALCULATED_FORM_SUBMISSIONS -> Value.HS_CALCULATED_FORM_SUBMISSIONS
                HS_CALCULATED_MERGED_VIDS -> Value.HS_CALCULATED_MERGED_VIDS
                HS_CALCULATED_MOBILE_NUMBER -> Value.HS_CALCULATED_MOBILE_NUMBER
                HS_CALCULATED_PHONE_NUMBER -> Value.HS_CALCULATED_PHONE_NUMBER
                HS_CALCULATED_PHONE_NUMBER_AREA_CODE -> Value.HS_CALCULATED_PHONE_NUMBER_AREA_CODE
                HS_CALCULATED_PHONE_NUMBER_COUNTRY_CODE ->
                    Value.HS_CALCULATED_PHONE_NUMBER_COUNTRY_CODE
                HS_CALCULATED_PHONE_NUMBER_REGION_CODE ->
                    Value.HS_CALCULATED_PHONE_NUMBER_REGION_CODE
                HS_CHAT_ASSISTANT_IQL_DATE -> Value.HS_CHAT_ASSISTANT_IQL_DATE
                HS_CHAT_ASSISTANT_SOURCE -> Value.HS_CHAT_ASSISTANT_SOURCE
                HS_CHAT_ASSISTANT_SUMMARY -> Value.HS_CHAT_ASSISTANT_SUMMARY
                HS_CLICKED_LINKEDIN_AD -> Value.HS_CLICKED_LINKEDIN_AD
                HS_CONTACT_CREATION_LEGAL_BASIS_SOURCE_INSTANCE_ID ->
                    Value.HS_CONTACT_CREATION_LEGAL_BASIS_SOURCE_INSTANCE_ID
                HS_CONTACT_ENRICHMENT_OPT_OUT -> Value.HS_CONTACT_ENRICHMENT_OPT_OUT
                HS_CONTACT_ENRICHMENT_OPT_OUT_TIMESTAMP ->
                    Value.HS_CONTACT_ENRICHMENT_OPT_OUT_TIMESTAMP
                HS_CONTENT_MEMBERSHIP_EMAIL -> Value.HS_CONTENT_MEMBERSHIP_EMAIL
                HS_CONTENT_MEMBERSHIP_EMAIL_CONFIRMED -> Value.HS_CONTENT_MEMBERSHIP_EMAIL_CONFIRMED
                HS_CONTENT_MEMBERSHIP_FOLLOW_UP_ENQUEUED_AT ->
                    Value.HS_CONTENT_MEMBERSHIP_FOLLOW_UP_ENQUEUED_AT
                HS_CONTENT_MEMBERSHIP_NOTES -> Value.HS_CONTENT_MEMBERSHIP_NOTES
                HS_CONTENT_MEMBERSHIP_REGISTERED_AT -> Value.HS_CONTENT_MEMBERSHIP_REGISTERED_AT
                HS_CONTENT_MEMBERSHIP_REGISTRATION_DOMAIN_SENT_TO ->
                    Value.HS_CONTENT_MEMBERSHIP_REGISTRATION_DOMAIN_SENT_TO
                HS_CONTENT_MEMBERSHIP_REGISTRATION_EMAIL_SENT_AT ->
                    Value.HS_CONTENT_MEMBERSHIP_REGISTRATION_EMAIL_SENT_AT
                HS_CONTENT_MEMBERSHIP_STATUS -> Value.HS_CONTENT_MEMBERSHIP_STATUS
                HS_CONVERSATIONS_VISITOR_EMAIL -> Value.HS_CONVERSATIONS_VISITOR_EMAIL
                HS_COUNT_IS_UNWORKED -> Value.HS_COUNT_IS_UNWORKED
                HS_COUNT_IS_WORKED -> Value.HS_COUNT_IS_WORKED
                HS_COUNTRY_REGION_CODE -> Value.HS_COUNTRY_REGION_CODE
                HS_CREATED_BY_CONVERSATIONS -> Value.HS_CREATED_BY_CONVERSATIONS
                HS_CROSS_ACCOUNT_NOTE -> Value.HS_CROSS_ACCOUNT_NOTE
                HS_CROSS_SELL_OPPORTUNITY -> Value.HS_CROSS_SELL_OPPORTUNITY
                HS_CURRENT_CUSTOMER -> Value.HS_CURRENT_CUSTOMER
                HS_CURRENTLY_ENROLLED_IN_PROSPECTING_AGENT ->
                    Value.HS_CURRENTLY_ENROLLED_IN_PROSPECTING_AGENT
                HS_CUSTOMER_AGENT_LEAD_STATUS -> Value.HS_CUSTOMER_AGENT_LEAD_STATUS
                HS_DATA_PRIVACY_ADS_CONSENT -> Value.HS_DATA_PRIVACY_ADS_CONSENT
                HS_DATE_ENTERED_CUSTOMER -> Value.HS_DATE_ENTERED_CUSTOMER
                HS_DATE_ENTERED_EVANGELIST -> Value.HS_DATE_ENTERED_EVANGELIST
                HS_DATE_ENTERED_LEAD -> Value.HS_DATE_ENTERED_LEAD
                HS_DATE_ENTERED_MARKETINGQUALIFIEDLEAD ->
                    Value.HS_DATE_ENTERED_MARKETINGQUALIFIEDLEAD
                HS_DATE_ENTERED_OPPORTUNITY -> Value.HS_DATE_ENTERED_OPPORTUNITY
                HS_DATE_ENTERED_OTHER -> Value.HS_DATE_ENTERED_OTHER
                HS_DATE_ENTERED_SALESQUALIFIEDLEAD -> Value.HS_DATE_ENTERED_SALESQUALIFIEDLEAD
                HS_DATE_ENTERED_SUBSCRIBER -> Value.HS_DATE_ENTERED_SUBSCRIBER
                HS_DATE_EXITED_CUSTOMER -> Value.HS_DATE_EXITED_CUSTOMER
                HS_DATE_EXITED_EVANGELIST -> Value.HS_DATE_EXITED_EVANGELIST
                HS_DATE_EXITED_LEAD -> Value.HS_DATE_EXITED_LEAD
                HS_DATE_EXITED_MARKETINGQUALIFIEDLEAD -> Value.HS_DATE_EXITED_MARKETINGQUALIFIEDLEAD
                HS_DATE_EXITED_OPPORTUNITY -> Value.HS_DATE_EXITED_OPPORTUNITY
                HS_DATE_EXITED_OTHER -> Value.HS_DATE_EXITED_OTHER
                HS_DATE_EXITED_SALESQUALIFIEDLEAD -> Value.HS_DATE_EXITED_SALESQUALIFIEDLEAD
                HS_DATE_EXITED_SUBSCRIBER -> Value.HS_DATE_EXITED_SUBSCRIBER
                HS_DOCUMENT_LAST_REVISITED -> Value.HS_DOCUMENT_LAST_REVISITED
                HS_EMAIL_BAD_ADDRESS -> Value.HS_EMAIL_BAD_ADDRESS
                HS_EMAIL_BOUNCE -> Value.HS_EMAIL_BOUNCE
                HS_EMAIL_CLICK -> Value.HS_EMAIL_CLICK
                HS_EMAIL_CUSTOMER_QUARANTINED_REASON -> Value.HS_EMAIL_CUSTOMER_QUARANTINED_REASON
                HS_EMAIL_DELIVERED -> Value.HS_EMAIL_DELIVERED
                HS_EMAIL_DOMAIN -> Value.HS_EMAIL_DOMAIN
                HS_EMAIL_FIRST_CLICK_DATE -> Value.HS_EMAIL_FIRST_CLICK_DATE
                HS_EMAIL_FIRST_OPEN_DATE -> Value.HS_EMAIL_FIRST_OPEN_DATE
                HS_EMAIL_FIRST_REPLY_DATE -> Value.HS_EMAIL_FIRST_REPLY_DATE
                HS_EMAIL_FIRST_SEND_DATE -> Value.HS_EMAIL_FIRST_SEND_DATE
                HS_EMAIL_HARD_BOUNCE_REASON -> Value.HS_EMAIL_HARD_BOUNCE_REASON
                HS_EMAIL_HARD_BOUNCE_REASON_ENUM -> Value.HS_EMAIL_HARD_BOUNCE_REASON_ENUM
                HS_EMAIL_IS_INELIGIBLE -> Value.HS_EMAIL_IS_INELIGIBLE
                HS_EMAIL_LAST_CLICK_DATE -> Value.HS_EMAIL_LAST_CLICK_DATE
                HS_EMAIL_LAST_EMAIL_NAME -> Value.HS_EMAIL_LAST_EMAIL_NAME
                HS_EMAIL_LAST_OPEN_DATE -> Value.HS_EMAIL_LAST_OPEN_DATE
                HS_EMAIL_LAST_REPLY_DATE -> Value.HS_EMAIL_LAST_REPLY_DATE
                HS_EMAIL_LAST_SEND_DATE -> Value.HS_EMAIL_LAST_SEND_DATE
                HS_EMAIL_LIVE_SOURCING_RESTRICTED -> Value.HS_EMAIL_LIVE_SOURCING_RESTRICTED
                HS_EMAIL_OPEN -> Value.HS_EMAIL_OPEN
                HS_EMAIL_OPTIMAL_SEND_DAY_OF_WEEK -> Value.HS_EMAIL_OPTIMAL_SEND_DAY_OF_WEEK
                HS_EMAIL_OPTIMAL_SEND_TIME_OF_DAY -> Value.HS_EMAIL_OPTIMAL_SEND_TIME_OF_DAY
                HS_EMAIL_OPTOUT -> Value.HS_EMAIL_OPTOUT
                HS_EMAIL_OPTOUT_SURVEY_REASON -> Value.HS_EMAIL_OPTOUT_SURVEY_REASON
                HS_EMAIL_QUARANTINED -> Value.HS_EMAIL_QUARANTINED
                HS_EMAIL_QUARANTINED_REASON -> Value.HS_EMAIL_QUARANTINED_REASON
                HS_EMAIL_RECIPIENT_FATIGUE_RECOVERY_TIME ->
                    Value.HS_EMAIL_RECIPIENT_FATIGUE_RECOVERY_TIME
                HS_EMAIL_REPLIED -> Value.HS_EMAIL_REPLIED
                HS_EMAIL_SENDS_SINCE_LAST_ENGAGEMENT -> Value.HS_EMAIL_SENDS_SINCE_LAST_ENGAGEMENT
                HS_EMAIL_TYPE -> Value.HS_EMAIL_TYPE
                HS_EMAILCONFIRMATIONSTATUS -> Value.HS_EMAILCONFIRMATIONSTATUS
                HS_EMPLOYMENT_CHANGE_DETECTED_DATE -> Value.HS_EMPLOYMENT_CHANGE_DETECTED_DATE
                HS_ENRICHED_EMAIL_BOUNCE_DETECTED -> Value.HS_ENRICHED_EMAIL_BOUNCE_DETECTED
                HS_FACEBOOK_AD_CLICKED -> Value.HS_FACEBOOK_AD_CLICKED
                HS_FACEBOOK_CLICK_ID -> Value.HS_FACEBOOK_CLICK_ID
                HS_FACEBOOKID -> Value.HS_FACEBOOKID
                HS_FEEDBACK_LAST_CES_SURVEY_DATE -> Value.HS_FEEDBACK_LAST_CES_SURVEY_DATE
                HS_FEEDBACK_LAST_CES_SURVEY_FOLLOW_UP -> Value.HS_FEEDBACK_LAST_CES_SURVEY_FOLLOW_UP
                HS_FEEDBACK_LAST_CES_SURVEY_RATING -> Value.HS_FEEDBACK_LAST_CES_SURVEY_RATING
                HS_FEEDBACK_LAST_CSAT_SURVEY_DATE -> Value.HS_FEEDBACK_LAST_CSAT_SURVEY_DATE
                HS_FEEDBACK_LAST_CSAT_SURVEY_FOLLOW_UP ->
                    Value.HS_FEEDBACK_LAST_CSAT_SURVEY_FOLLOW_UP
                HS_FEEDBACK_LAST_CSAT_SURVEY_RATING -> Value.HS_FEEDBACK_LAST_CSAT_SURVEY_RATING
                HS_FEEDBACK_LAST_NPS_FOLLOW_UP -> Value.HS_FEEDBACK_LAST_NPS_FOLLOW_UP
                HS_FEEDBACK_LAST_NPS_RATING -> Value.HS_FEEDBACK_LAST_NPS_RATING
                HS_FEEDBACK_LAST_NPS_RATING_NUMBER -> Value.HS_FEEDBACK_LAST_NPS_RATING_NUMBER
                HS_FEEDBACK_LAST_SURVEY_DATE -> Value.HS_FEEDBACK_LAST_SURVEY_DATE
                HS_FEEDBACK_SHOW_NPS_WEB_SURVEY -> Value.HS_FEEDBACK_SHOW_NPS_WEB_SURVEY
                HS_FIRST_CLOSED_ORDER_ID -> Value.HS_FIRST_CLOSED_ORDER_ID
                HS_FIRST_ENGAGEMENT_OBJECT_ID -> Value.HS_FIRST_ENGAGEMENT_OBJECT_ID
                HS_FIRST_ORDER_CLOSED_DATE -> Value.HS_FIRST_ORDER_CLOSED_DATE
                HS_FIRST_OUTREACH_DATE -> Value.HS_FIRST_OUTREACH_DATE
                HS_FIRST_SUBSCRIPTION_CREATE_DATE -> Value.HS_FIRST_SUBSCRIPTION_CREATE_DATE
                HS_FULL_NAME_OR_EMAIL -> Value.HS_FULL_NAME_OR_EMAIL
                HS_GOOGLE_CLICK_ID -> Value.HS_GOOGLE_CLICK_ID
                HS_GOOGLEPLUSID -> Value.HS_GOOGLEPLUSID
                HS_GPS_COORDINATES -> Value.HS_GPS_COORDINATES
                HS_GPS_ERROR -> Value.HS_GPS_ERROR
                HS_GPS_LATITUDE -> Value.HS_GPS_LATITUDE
                HS_GPS_LONGITUDE -> Value.HS_GPS_LONGITUDE
                HS_HAS_ACTIVE_SUBSCRIPTION -> Value.HS_HAS_ACTIVE_SUBSCRIPTION
                HS_INFERRED_LANGUAGE_CODES -> Value.HS_INFERRED_LANGUAGE_CODES
                HS_INTENT_PAID_UP_TO_DATE -> Value.HS_INTENT_PAID_UP_TO_DATE
                HS_INTENT_SIGNALS_ENABLED -> Value.HS_INTENT_SIGNALS_ENABLED
                HS_IP_TIMEZONE -> Value.HS_IP_TIMEZONE
                HS_IS_CONTACT -> Value.HS_IS_CONTACT
                HS_IS_ENRICHED -> Value.HS_IS_ENRICHED
                HS_IS_MERGE_REVERTIBLE -> Value.HS_IS_MERGE_REVERTIBLE
                HS_IS_UNWORKED -> Value.HS_IS_UNWORKED
                HS_JOB_CHANGE_DETECTED_DATE -> Value.HS_JOB_CHANGE_DETECTED_DATE
                HS_JOURNEY_STAGE -> Value.HS_JOURNEY_STAGE
                HS_LANGUAGE -> Value.HS_LANGUAGE
                HS_LAST_METERED_ENRICHMENT_TIMESTAMP -> Value.HS_LAST_METERED_ENRICHMENT_TIMESTAMP
                HS_LAST_SALES_ACTIVITY_DATE -> Value.HS_LAST_SALES_ACTIVITY_DATE
                HS_LAST_SALES_ACTIVITY_TIMESTAMP -> Value.HS_LAST_SALES_ACTIVITY_TIMESTAMP
                HS_LAST_SALES_ACTIVITY_TYPE -> Value.HS_LAST_SALES_ACTIVITY_TYPE
                HS_LAST_SMS_SEND_DATE -> Value.HS_LAST_SMS_SEND_DATE
                HS_LAST_SMS_SEND_NAME -> Value.HS_LAST_SMS_SEND_NAME
                HS_LATEST_DISQUALIFIED_LEAD_DATE -> Value.HS_LATEST_DISQUALIFIED_LEAD_DATE
                HS_LATEST_MEETING_ACTIVITY -> Value.HS_LATEST_MEETING_ACTIVITY
                HS_LATEST_OPEN_LEAD_DATE -> Value.HS_LATEST_OPEN_LEAD_DATE
                HS_LATEST_QUALIFIED_LEAD_DATE -> Value.HS_LATEST_QUALIFIED_LEAD_DATE
                HS_LATEST_SEQUENCE_ENDED_DATE -> Value.HS_LATEST_SEQUENCE_ENDED_DATE
                HS_LATEST_SEQUENCE_ENROLLED -> Value.HS_LATEST_SEQUENCE_ENROLLED
                HS_LATEST_SEQUENCE_ENROLLED_DATE -> Value.HS_LATEST_SEQUENCE_ENROLLED_DATE
                HS_LATEST_SEQUENCE_FINISHED_DATE -> Value.HS_LATEST_SEQUENCE_FINISHED_DATE
                HS_LATEST_SEQUENCE_UNENROLLED_DATE -> Value.HS_LATEST_SEQUENCE_UNENROLLED_DATE
                HS_LATEST_SOURCE -> Value.HS_LATEST_SOURCE
                HS_LATEST_SOURCE_COMPOSITE_DATA -> Value.HS_LATEST_SOURCE_COMPOSITE_DATA
                HS_LATEST_SOURCE_DATA_1 -> Value.HS_LATEST_SOURCE_DATA_1
                HS_LATEST_SOURCE_DATA_2 -> Value.HS_LATEST_SOURCE_DATA_2
                HS_LATEST_SOURCE_TIMESTAMP -> Value.HS_LATEST_SOURCE_TIMESTAMP
                HS_LATEST_SUBSCRIPTION_CREATE_DATE -> Value.HS_LATEST_SUBSCRIPTION_CREATE_DATE
                HS_LATITUDE -> Value.HS_LATITUDE
                HS_LEAD_STATUS -> Value.HS_LEAD_STATUS
                HS_LEGAL_BASIS -> Value.HS_LEGAL_BASIS
                HS_LIFECYCLESTAGE_CUSTOMER_DATE -> Value.HS_LIFECYCLESTAGE_CUSTOMER_DATE
                HS_LIFECYCLESTAGE_EVANGELIST_DATE -> Value.HS_LIFECYCLESTAGE_EVANGELIST_DATE
                HS_LIFECYCLESTAGE_LEAD_DATE -> Value.HS_LIFECYCLESTAGE_LEAD_DATE
                HS_LIFECYCLESTAGE_MARKETINGQUALIFIEDLEAD_DATE ->
                    Value.HS_LIFECYCLESTAGE_MARKETINGQUALIFIEDLEAD_DATE
                HS_LIFECYCLESTAGE_OPPORTUNITY_DATE -> Value.HS_LIFECYCLESTAGE_OPPORTUNITY_DATE
                HS_LIFECYCLESTAGE_OTHER_DATE -> Value.HS_LIFECYCLESTAGE_OTHER_DATE
                HS_LIFECYCLESTAGE_SALESQUALIFIEDLEAD_DATE ->
                    Value.HS_LIFECYCLESTAGE_SALESQUALIFIEDLEAD_DATE
                HS_LIFECYCLESTAGE_SUBSCRIBER_DATE -> Value.HS_LIFECYCLESTAGE_SUBSCRIBER_DATE
                HS_LINKEDIN_AD_CLICKED -> Value.HS_LINKEDIN_AD_CLICKED
                HS_LINKEDIN_CLICK_ID -> Value.HS_LINKEDIN_CLICK_ID
                HS_LINKEDIN_URL -> Value.HS_LINKEDIN_URL
                HS_LINKEDINID -> Value.HS_LINKEDINID
                HS_LIVE_ENRICHMENT_DEADLINE -> Value.HS_LIVE_ENRICHMENT_DEADLINE
                HS_LONGITUDE -> Value.HS_LONGITUDE
                HS_MANUAL_CAMPAIGN_IDS -> Value.HS_MANUAL_CAMPAIGN_IDS
                HS_MARKETABLE_REASON_ID -> Value.HS_MARKETABLE_REASON_ID
                HS_MARKETABLE_REASON_TYPE -> Value.HS_MARKETABLE_REASON_TYPE
                HS_MARKETABLE_STATUS -> Value.HS_MARKETABLE_STATUS
                HS_MARKETABLE_UNTIL_RENEWAL -> Value.HS_MARKETABLE_UNTIL_RENEWAL
                HS_MEMBERSHIP_HAS_ACCESSED_PRIVATE_CONTENT ->
                    Value.HS_MEMBERSHIP_HAS_ACCESSED_PRIVATE_CONTENT
                HS_MEMBERSHIP_LAST_PRIVATE_CONTENT_ACCESS_DATE ->
                    Value.HS_MEMBERSHIP_LAST_PRIVATE_CONTENT_ACCESS_DATE
                HS_MESSAGING_ENGAGEMENT_SCORE -> Value.HS_MESSAGING_ENGAGEMENT_SCORE
                HS_MOBILE_SDK_PUSH_TOKENS -> Value.HS_MOBILE_SDK_PUSH_TOKENS
                HS_NOTES_LAST_ACTIVITY -> Value.HS_NOTES_LAST_ACTIVITY
                HS_NOTES_NEXT_ACTIVITY -> Value.HS_NOTES_NEXT_ACTIVITY
                HS_NOTES_NEXT_ACTIVITY_TYPE -> Value.HS_NOTES_NEXT_ACTIVITY_TYPE
                HS_PERSONA -> Value.HS_PERSONA
                HS_PINNED_ENGAGEMENT_ID -> Value.HS_PINNED_ENGAGEMENT_ID
                HS_PIPELINE -> Value.HS_PIPELINE
                HS_PREDICTIVECONTACTSCORE -> Value.HS_PREDICTIVECONTACTSCORE
                HS_PREDICTIVECONTACTSCORE_TMP -> Value.HS_PREDICTIVECONTACTSCORE_TMP
                HS_PREDICTIVECONTACTSCORE_V2 -> Value.HS_PREDICTIVECONTACTSCORE_V2
                HS_PREDICTIVECONTACTSCOREBUCKET -> Value.HS_PREDICTIVECONTACTSCOREBUCKET
                HS_PREDICTIVESCORINGTIER -> Value.HS_PREDICTIVESCORINGTIER
                HS_PREDICTIVESCORINGTIER_TMP -> Value.HS_PREDICTIVESCORINGTIER_TMP
                HS_PROSPECTING_AGENT_ACTIVELY_ENROLLED_COUNT ->
                    Value.HS_PROSPECTING_AGENT_ACTIVELY_ENROLLED_COUNT
                HS_PROSPECTING_AGENT_LAST_ENROLLED -> Value.HS_PROSPECTING_AGENT_LAST_ENROLLED
                HS_PROSPECTING_AGENT_TOTAL_ENROLLED_COUNT ->
                    Value.HS_PROSPECTING_AGENT_TOTAL_ENROLLED_COUNT
                HS_QUARANTINED_EMAILS -> Value.HS_QUARANTINED_EMAILS
                HS_RECENT_CLOSED_ORDER_DATE -> Value.HS_RECENT_CLOSED_ORDER_DATE
                HS_REGISTERED_MEMBER -> Value.HS_REGISTERED_MEMBER
                HS_REGISTRATION_METHOD -> Value.HS_REGISTRATION_METHOD
                HS_RETURNING_TO_OFFICE_DETECTED_DATE -> Value.HS_RETURNING_TO_OFFICE_DETECTED_DATE
                HS_ROLE -> Value.HS_ROLE
                HS_SA_FIRST_ENGAGEMENT_DATE -> Value.HS_SA_FIRST_ENGAGEMENT_DATE
                HS_SA_FIRST_ENGAGEMENT_DESCR -> Value.HS_SA_FIRST_ENGAGEMENT_DESCR
                HS_SA_FIRST_ENGAGEMENT_OBJECT_TYPE -> Value.HS_SA_FIRST_ENGAGEMENT_OBJECT_TYPE
                HS_SALES_EMAIL_LAST_CLICKED -> Value.HS_SALES_EMAIL_LAST_CLICKED
                HS_SALES_EMAIL_LAST_OPENED -> Value.HS_SALES_EMAIL_LAST_OPENED
                HS_SALES_EMAIL_LAST_REPLIED -> Value.HS_SALES_EMAIL_LAST_REPLIED
                HS_SEARCHABLE_CALCULATED_INTERNATIONAL_MOBILE_NUMBER ->
                    Value.HS_SEARCHABLE_CALCULATED_INTERNATIONAL_MOBILE_NUMBER
                HS_SEARCHABLE_CALCULATED_INTERNATIONAL_PHONE_NUMBER ->
                    Value.HS_SEARCHABLE_CALCULATED_INTERNATIONAL_PHONE_NUMBER
                HS_SEARCHABLE_CALCULATED_MOBILE_NUMBER ->
                    Value.HS_SEARCHABLE_CALCULATED_MOBILE_NUMBER
                HS_SEARCHABLE_CALCULATED_PHONE_NUMBER -> Value.HS_SEARCHABLE_CALCULATED_PHONE_NUMBER
                HS_SENIORITY -> Value.HS_SENIORITY
                HS_SEQUENCES_ACTIVELY_ENROLLED_COUNT -> Value.HS_SEQUENCES_ACTIVELY_ENROLLED_COUNT
                HS_SEQUENCES_ENROLLED_COUNT -> Value.HS_SEQUENCES_ENROLLED_COUNT
                HS_SEQUENCES_IS_ENROLLED -> Value.HS_SEQUENCES_IS_ENROLLED
                HS_SOCIAL_FACEBOOK_CLICKS -> Value.HS_SOCIAL_FACEBOOK_CLICKS
                HS_SOCIAL_GOOGLE_PLUS_CLICKS -> Value.HS_SOCIAL_GOOGLE_PLUS_CLICKS
                HS_SOCIAL_LAST_ENGAGEMENT -> Value.HS_SOCIAL_LAST_ENGAGEMENT
                HS_SOCIAL_LINKEDIN_CLICKS -> Value.HS_SOCIAL_LINKEDIN_CLICKS
                HS_SOCIAL_NUM_BROADCAST_CLICKS -> Value.HS_SOCIAL_NUM_BROADCAST_CLICKS
                HS_SOCIAL_TWITTER_CLICKS -> Value.HS_SOCIAL_TWITTER_CLICKS
                HS_SOURCE_OBJECT_ID -> Value.HS_SOURCE_OBJECT_ID
                HS_SOURCE_PORTAL_ID -> Value.HS_SOURCE_PORTAL_ID
                HS_STATE_CODE -> Value.HS_STATE_CODE
                HS_SUB_ROLE -> Value.HS_SUB_ROLE
                HS_TESTPURGE -> Value.HS_TESTPURGE
                HS_TESTROLLBACK -> Value.HS_TESTROLLBACK
                HS_TIKTOK_AD_CLICKED -> Value.HS_TIKTOK_AD_CLICKED
                HS_TIKTOK_CLICK_ID -> Value.HS_TIKTOK_CLICK_ID
                HS_TIME_BETWEEN_CONTACT_CREATION_AND_DEAL_CLOSE ->
                    Value.HS_TIME_BETWEEN_CONTACT_CREATION_AND_DEAL_CLOSE
                HS_TIME_BETWEEN_CONTACT_CREATION_AND_DEAL_CREATION ->
                    Value.HS_TIME_BETWEEN_CONTACT_CREATION_AND_DEAL_CREATION
                HS_TIME_IN_CUSTOMER -> Value.HS_TIME_IN_CUSTOMER
                HS_TIME_IN_EVANGELIST -> Value.HS_TIME_IN_EVANGELIST
                HS_TIME_IN_LEAD -> Value.HS_TIME_IN_LEAD
                HS_TIME_IN_MARKETINGQUALIFIEDLEAD -> Value.HS_TIME_IN_MARKETINGQUALIFIEDLEAD
                HS_TIME_IN_OPPORTUNITY -> Value.HS_TIME_IN_OPPORTUNITY
                HS_TIME_IN_OTHER -> Value.HS_TIME_IN_OTHER
                HS_TIME_IN_SALESQUALIFIEDLEAD -> Value.HS_TIME_IN_SALESQUALIFIEDLEAD
                HS_TIME_IN_SUBSCRIBER -> Value.HS_TIME_IN_SUBSCRIBER
                HS_TIME_TO_FIRST_ENGAGEMENT -> Value.HS_TIME_TO_FIRST_ENGAGEMENT
                HS_TIME_TO_MOVE_FROM_LEAD_TO_CUSTOMER -> Value.HS_TIME_TO_MOVE_FROM_LEAD_TO_CUSTOMER
                HS_TIME_TO_MOVE_FROM_MARKETINGQUALIFIEDLEAD_TO_CUSTOMER ->
                    Value.HS_TIME_TO_MOVE_FROM_MARKETINGQUALIFIEDLEAD_TO_CUSTOMER
                HS_TIME_TO_MOVE_FROM_OPPORTUNITY_TO_CUSTOMER ->
                    Value.HS_TIME_TO_MOVE_FROM_OPPORTUNITY_TO_CUSTOMER
                HS_TIME_TO_MOVE_FROM_SALESQUALIFIEDLEAD_TO_CUSTOMER ->
                    Value.HS_TIME_TO_MOVE_FROM_SALESQUALIFIEDLEAD_TO_CUSTOMER
                HS_TIME_TO_MOVE_FROM_SUBSCRIBER_TO_CUSTOMER ->
                    Value.HS_TIME_TO_MOVE_FROM_SUBSCRIBER_TO_CUSTOMER
                HS_TIMEZONE -> Value.HS_TIMEZONE
                HS_TWITTERID -> Value.HS_TWITTERID
                HS_V2_CUMULATIVE_TIME_IN_CUSTOMER -> Value.HS_V2_CUMULATIVE_TIME_IN_CUSTOMER
                HS_V2_CUMULATIVE_TIME_IN_EVANGELIST -> Value.HS_V2_CUMULATIVE_TIME_IN_EVANGELIST
                HS_V2_CUMULATIVE_TIME_IN_LEAD -> Value.HS_V2_CUMULATIVE_TIME_IN_LEAD
                HS_V2_CUMULATIVE_TIME_IN_MARKETINGQUALIFIEDLEAD ->
                    Value.HS_V2_CUMULATIVE_TIME_IN_MARKETINGQUALIFIEDLEAD
                HS_V2_CUMULATIVE_TIME_IN_OPPORTUNITY -> Value.HS_V2_CUMULATIVE_TIME_IN_OPPORTUNITY
                HS_V2_CUMULATIVE_TIME_IN_OTHER -> Value.HS_V2_CUMULATIVE_TIME_IN_OTHER
                HS_V2_CUMULATIVE_TIME_IN_SALESQUALIFIEDLEAD ->
                    Value.HS_V2_CUMULATIVE_TIME_IN_SALESQUALIFIEDLEAD
                HS_V2_CUMULATIVE_TIME_IN_SUBSCRIBER -> Value.HS_V2_CUMULATIVE_TIME_IN_SUBSCRIBER
                HS_V2_DATE_ENTERED_CURRENT_STAGE -> Value.HS_V2_DATE_ENTERED_CURRENT_STAGE
                HS_V2_DATE_ENTERED_CUSTOMER -> Value.HS_V2_DATE_ENTERED_CUSTOMER
                HS_V2_DATE_ENTERED_EVANGELIST -> Value.HS_V2_DATE_ENTERED_EVANGELIST
                HS_V2_DATE_ENTERED_LEAD -> Value.HS_V2_DATE_ENTERED_LEAD
                HS_V2_DATE_ENTERED_MARKETINGQUALIFIEDLEAD ->
                    Value.HS_V2_DATE_ENTERED_MARKETINGQUALIFIEDLEAD
                HS_V2_DATE_ENTERED_OPPORTUNITY -> Value.HS_V2_DATE_ENTERED_OPPORTUNITY
                HS_V2_DATE_ENTERED_OTHER -> Value.HS_V2_DATE_ENTERED_OTHER
                HS_V2_DATE_ENTERED_SALESQUALIFIEDLEAD -> Value.HS_V2_DATE_ENTERED_SALESQUALIFIEDLEAD
                HS_V2_DATE_ENTERED_SUBSCRIBER -> Value.HS_V2_DATE_ENTERED_SUBSCRIBER
                HS_V2_DATE_EXITED_CUSTOMER -> Value.HS_V2_DATE_EXITED_CUSTOMER
                HS_V2_DATE_EXITED_EVANGELIST -> Value.HS_V2_DATE_EXITED_EVANGELIST
                HS_V2_DATE_EXITED_LEAD -> Value.HS_V2_DATE_EXITED_LEAD
                HS_V2_DATE_EXITED_MARKETINGQUALIFIEDLEAD ->
                    Value.HS_V2_DATE_EXITED_MARKETINGQUALIFIEDLEAD
                HS_V2_DATE_EXITED_OPPORTUNITY -> Value.HS_V2_DATE_EXITED_OPPORTUNITY
                HS_V2_DATE_EXITED_OTHER -> Value.HS_V2_DATE_EXITED_OTHER
                HS_V2_DATE_EXITED_SALESQUALIFIEDLEAD -> Value.HS_V2_DATE_EXITED_SALESQUALIFIEDLEAD
                HS_V2_DATE_EXITED_SUBSCRIBER -> Value.HS_V2_DATE_EXITED_SUBSCRIBER
                HS_V2_LATEST_TIME_IN_CUSTOMER -> Value.HS_V2_LATEST_TIME_IN_CUSTOMER
                HS_V2_LATEST_TIME_IN_EVANGELIST -> Value.HS_V2_LATEST_TIME_IN_EVANGELIST
                HS_V2_LATEST_TIME_IN_LEAD -> Value.HS_V2_LATEST_TIME_IN_LEAD
                HS_V2_LATEST_TIME_IN_MARKETINGQUALIFIEDLEAD ->
                    Value.HS_V2_LATEST_TIME_IN_MARKETINGQUALIFIEDLEAD
                HS_V2_LATEST_TIME_IN_OPPORTUNITY -> Value.HS_V2_LATEST_TIME_IN_OPPORTUNITY
                HS_V2_LATEST_TIME_IN_OTHER -> Value.HS_V2_LATEST_TIME_IN_OTHER
                HS_V2_LATEST_TIME_IN_SALESQUALIFIEDLEAD ->
                    Value.HS_V2_LATEST_TIME_IN_SALESQUALIFIEDLEAD
                HS_V2_LATEST_TIME_IN_SUBSCRIBER -> Value.HS_V2_LATEST_TIME_IN_SUBSCRIBER
                HS_V2_TIME_IN_CURRENT_STAGE -> Value.HS_V2_TIME_IN_CURRENT_STAGE
                HS_WHATSAPP_PHONE_NUMBER -> Value.HS_WHATSAPP_PHONE_NUMBER
                HUBSPOT_OWNER_ID -> Value.HUBSPOT_OWNER_ID
                HUBSPOTSCORE -> Value.HUBSPOTSCORE
                INDUSTRY -> Value.INDUSTRY
                IP_CITY -> Value.IP_CITY
                IP_COUNTRY -> Value.IP_COUNTRY
                IP_COUNTRY_CODE -> Value.IP_COUNTRY_CODE
                IP_LATLON -> Value.IP_LATLON
                IP_STATE -> Value.IP_STATE
                IP_STATE_CODE -> Value.IP_STATE_CODE
                IP_ZIPCODE -> Value.IP_ZIPCODE
                JOB_FUNCTION -> Value.JOB_FUNCTION
                JOBTITLE -> Value.JOBTITLE
                KLOUTSCOREGENERAL -> Value.KLOUTSCOREGENERAL
                LASTMODIFIEDDATE -> Value.LASTMODIFIEDDATE
                LASTNAME -> Value.LASTNAME
                LIFECYCLESTAGE -> Value.LIFECYCLESTAGE
                LINKEDINBIO -> Value.LINKEDINBIO
                LINKEDINCONNECTIONS -> Value.LINKEDINCONNECTIONS
                MARITAL_STATUS -> Value.MARITAL_STATUS
                MESSAGE -> Value.MESSAGE
                MILITARY_STATUS -> Value.MILITARY_STATUS
                MOBILEPHONE -> Value.MOBILEPHONE
                NOTES_LAST_CONTACTED -> Value.NOTES_LAST_CONTACTED
                NOTES_LAST_UPDATED -> Value.NOTES_LAST_UPDATED
                NOTES_NEXT_ACTIVITY_DATE -> Value.NOTES_NEXT_ACTIVITY_DATE
                NUM_ASSOCIATED_DEALS -> Value.NUM_ASSOCIATED_DEALS
                NUM_CONTACTED_NOTES -> Value.NUM_CONTACTED_NOTES
                NUM_CONVERSION_EVENTS -> Value.NUM_CONVERSION_EVENTS
                NUM_NOTES -> Value.NUM_NOTES
                NUM_UNIQUE_CONVERSION_EVENTS -> Value.NUM_UNIQUE_CONVERSION_EVENTS
                NUMEMPLOYEES -> Value.NUMEMPLOYEES
                OWNEREMAIL -> Value.OWNEREMAIL
                OWNERNAME -> Value.OWNERNAME
                PHONE -> Value.PHONE
                PHOTO -> Value.PHOTO
                RECENT_CONVERSION_DATE -> Value.RECENT_CONVERSION_DATE
                RECENT_CONVERSION_EVENT_NAME -> Value.RECENT_CONVERSION_EVENT_NAME
                RECENT_DEAL_AMOUNT -> Value.RECENT_DEAL_AMOUNT
                RECENT_DEAL_CLOSE_DATE -> Value.RECENT_DEAL_CLOSE_DATE
                RELATIONSHIP_STATUS -> Value.RELATIONSHIP_STATUS
                SALUTATION -> Value.SALUTATION
                SCHOOL -> Value.SCHOOL
                SENIORITY -> Value.SENIORITY
                START_DATE -> Value.START_DATE
                STATE -> Value.STATE
                SURVEYMONKEYEVENTLASTUPDATED -> Value.SURVEYMONKEYEVENTLASTUPDATED
                TOTAL_REVENUE -> Value.TOTAL_REVENUE
                TWITTERBIO -> Value.TWITTERBIO
                TWITTERHANDLE -> Value.TWITTERHANDLE
                TWITTERPROFILEPHOTO -> Value.TWITTERPROFILEPHOTO
                WEBINAREVENTLASTUPDATED -> Value.WEBINAREVENTLASTUPDATED
                WEBSITE -> Value.WEBSITE
                WORK_EMAIL -> Value.WORK_EMAIL
                ZIP -> Value.ZIP
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ADDRESS -> Known.ADDRESS
                ANNUALREVENUE -> Known.ANNUALREVENUE
                ASSOCIATEDCOMPANYID -> Known.ASSOCIATEDCOMPANYID
                ASSOCIATEDCOMPANYLASTUPDATED -> Known.ASSOCIATEDCOMPANYLASTUPDATED
                CITY -> Known.CITY
                CLOSEDATE -> Known.CLOSEDATE
                COMPANY -> Known.COMPANY
                COMPANY_SIZE -> Known.COMPANY_SIZE
                COUNTRY -> Known.COUNTRY
                CREATEDATE -> Known.CREATEDATE
                CURRENTLYINWORKFLOW -> Known.CURRENTLYINWORKFLOW
                DATE_OF_BIRTH -> Known.DATE_OF_BIRTH
                DAYS_TO_CLOSE -> Known.DAYS_TO_CLOSE
                DEGREE -> Known.DEGREE
                EMAIL -> Known.EMAIL
                ENGAGEMENTS_LAST_MEETING_BOOKED -> Known.ENGAGEMENTS_LAST_MEETING_BOOKED
                ENGAGEMENTS_LAST_MEETING_BOOKED_CAMPAIGN ->
                    Known.ENGAGEMENTS_LAST_MEETING_BOOKED_CAMPAIGN
                ENGAGEMENTS_LAST_MEETING_BOOKED_MEDIUM ->
                    Known.ENGAGEMENTS_LAST_MEETING_BOOKED_MEDIUM
                ENGAGEMENTS_LAST_MEETING_BOOKED_SOURCE ->
                    Known.ENGAGEMENTS_LAST_MEETING_BOOKED_SOURCE
                FAX -> Known.FAX
                FIELD_OF_STUDY -> Known.FIELD_OF_STUDY
                FIRST_CONVERSION_DATE -> Known.FIRST_CONVERSION_DATE
                FIRST_CONVERSION_EVENT_NAME -> Known.FIRST_CONVERSION_EVENT_NAME
                FIRST_DEAL_CREATED_DATE -> Known.FIRST_DEAL_CREATED_DATE
                FIRSTNAME -> Known.FIRSTNAME
                FOLLOWERCOUNT -> Known.FOLLOWERCOUNT
                GENDER -> Known.GENDER
                GRADUATION_DATE -> Known.GRADUATION_DATE
                HS_ADDITIONAL_EMAILS -> Known.HS_ADDITIONAL_EMAILS
                HS_ALL_CONTACT_VIDS -> Known.HS_ALL_CONTACT_VIDS
                HS_ANALYTICS_AVERAGE_PAGE_VIEWS -> Known.HS_ANALYTICS_AVERAGE_PAGE_VIEWS
                HS_ANALYTICS_FIRST_REFERRER -> Known.HS_ANALYTICS_FIRST_REFERRER
                HS_ANALYTICS_FIRST_TIMESTAMP -> Known.HS_ANALYTICS_FIRST_TIMESTAMP
                HS_ANALYTICS_FIRST_TOUCH_CONVERTING_CAMPAIGN ->
                    Known.HS_ANALYTICS_FIRST_TOUCH_CONVERTING_CAMPAIGN
                HS_ANALYTICS_FIRST_URL -> Known.HS_ANALYTICS_FIRST_URL
                HS_ANALYTICS_FIRST_VISIT_TIMESTAMP -> Known.HS_ANALYTICS_FIRST_VISIT_TIMESTAMP
                HS_ANALYTICS_LAST_REFERRER -> Known.HS_ANALYTICS_LAST_REFERRER
                HS_ANALYTICS_LAST_TIMESTAMP -> Known.HS_ANALYTICS_LAST_TIMESTAMP
                HS_ANALYTICS_LAST_TOUCH_CONVERTING_CAMPAIGN ->
                    Known.HS_ANALYTICS_LAST_TOUCH_CONVERTING_CAMPAIGN
                HS_ANALYTICS_LAST_URL -> Known.HS_ANALYTICS_LAST_URL
                HS_ANALYTICS_LAST_VISIT_TIMESTAMP -> Known.HS_ANALYTICS_LAST_VISIT_TIMESTAMP
                HS_ANALYTICS_NUM_EVENT_COMPLETIONS -> Known.HS_ANALYTICS_NUM_EVENT_COMPLETIONS
                HS_ANALYTICS_NUM_PAGE_VIEWS -> Known.HS_ANALYTICS_NUM_PAGE_VIEWS
                HS_ANALYTICS_NUM_VISITS -> Known.HS_ANALYTICS_NUM_VISITS
                HS_ANALYTICS_REVENUE -> Known.HS_ANALYTICS_REVENUE
                HS_ANALYTICS_SOURCE -> Known.HS_ANALYTICS_SOURCE
                HS_ANALYTICS_SOURCE_COMPOSITE_DATA -> Known.HS_ANALYTICS_SOURCE_COMPOSITE_DATA
                HS_ANALYTICS_SOURCE_DATA_1 -> Known.HS_ANALYTICS_SOURCE_DATA_1
                HS_ANALYTICS_SOURCE_DATA_2 -> Known.HS_ANALYTICS_SOURCE_DATA_2
                HS_ASSOCIATED_TARGET_ACCOUNTS -> Known.HS_ASSOCIATED_TARGET_ACCOUNTS
                HS_AVATAR_FILEMANAGER_KEY -> Known.HS_AVATAR_FILEMANAGER_KEY
                HS_BING_AD_CLICKED -> Known.HS_BING_AD_CLICKED
                HS_BING_CLICK_ID -> Known.HS_BING_CLICK_ID
                HS_BUYING_ROLE -> Known.HS_BUYING_ROLE
                HS_CALCULATED_FORM_SUBMISSIONS -> Known.HS_CALCULATED_FORM_SUBMISSIONS
                HS_CALCULATED_MERGED_VIDS -> Known.HS_CALCULATED_MERGED_VIDS
                HS_CALCULATED_MOBILE_NUMBER -> Known.HS_CALCULATED_MOBILE_NUMBER
                HS_CALCULATED_PHONE_NUMBER -> Known.HS_CALCULATED_PHONE_NUMBER
                HS_CALCULATED_PHONE_NUMBER_AREA_CODE -> Known.HS_CALCULATED_PHONE_NUMBER_AREA_CODE
                HS_CALCULATED_PHONE_NUMBER_COUNTRY_CODE ->
                    Known.HS_CALCULATED_PHONE_NUMBER_COUNTRY_CODE
                HS_CALCULATED_PHONE_NUMBER_REGION_CODE ->
                    Known.HS_CALCULATED_PHONE_NUMBER_REGION_CODE
                HS_CHAT_ASSISTANT_IQL_DATE -> Known.HS_CHAT_ASSISTANT_IQL_DATE
                HS_CHAT_ASSISTANT_SOURCE -> Known.HS_CHAT_ASSISTANT_SOURCE
                HS_CHAT_ASSISTANT_SUMMARY -> Known.HS_CHAT_ASSISTANT_SUMMARY
                HS_CLICKED_LINKEDIN_AD -> Known.HS_CLICKED_LINKEDIN_AD
                HS_CONTACT_CREATION_LEGAL_BASIS_SOURCE_INSTANCE_ID ->
                    Known.HS_CONTACT_CREATION_LEGAL_BASIS_SOURCE_INSTANCE_ID
                HS_CONTACT_ENRICHMENT_OPT_OUT -> Known.HS_CONTACT_ENRICHMENT_OPT_OUT
                HS_CONTACT_ENRICHMENT_OPT_OUT_TIMESTAMP ->
                    Known.HS_CONTACT_ENRICHMENT_OPT_OUT_TIMESTAMP
                HS_CONTENT_MEMBERSHIP_EMAIL -> Known.HS_CONTENT_MEMBERSHIP_EMAIL
                HS_CONTENT_MEMBERSHIP_EMAIL_CONFIRMED -> Known.HS_CONTENT_MEMBERSHIP_EMAIL_CONFIRMED
                HS_CONTENT_MEMBERSHIP_FOLLOW_UP_ENQUEUED_AT ->
                    Known.HS_CONTENT_MEMBERSHIP_FOLLOW_UP_ENQUEUED_AT
                HS_CONTENT_MEMBERSHIP_NOTES -> Known.HS_CONTENT_MEMBERSHIP_NOTES
                HS_CONTENT_MEMBERSHIP_REGISTERED_AT -> Known.HS_CONTENT_MEMBERSHIP_REGISTERED_AT
                HS_CONTENT_MEMBERSHIP_REGISTRATION_DOMAIN_SENT_TO ->
                    Known.HS_CONTENT_MEMBERSHIP_REGISTRATION_DOMAIN_SENT_TO
                HS_CONTENT_MEMBERSHIP_REGISTRATION_EMAIL_SENT_AT ->
                    Known.HS_CONTENT_MEMBERSHIP_REGISTRATION_EMAIL_SENT_AT
                HS_CONTENT_MEMBERSHIP_STATUS -> Known.HS_CONTENT_MEMBERSHIP_STATUS
                HS_CONVERSATIONS_VISITOR_EMAIL -> Known.HS_CONVERSATIONS_VISITOR_EMAIL
                HS_COUNT_IS_UNWORKED -> Known.HS_COUNT_IS_UNWORKED
                HS_COUNT_IS_WORKED -> Known.HS_COUNT_IS_WORKED
                HS_COUNTRY_REGION_CODE -> Known.HS_COUNTRY_REGION_CODE
                HS_CREATED_BY_CONVERSATIONS -> Known.HS_CREATED_BY_CONVERSATIONS
                HS_CROSS_ACCOUNT_NOTE -> Known.HS_CROSS_ACCOUNT_NOTE
                HS_CROSS_SELL_OPPORTUNITY -> Known.HS_CROSS_SELL_OPPORTUNITY
                HS_CURRENT_CUSTOMER -> Known.HS_CURRENT_CUSTOMER
                HS_CURRENTLY_ENROLLED_IN_PROSPECTING_AGENT ->
                    Known.HS_CURRENTLY_ENROLLED_IN_PROSPECTING_AGENT
                HS_CUSTOMER_AGENT_LEAD_STATUS -> Known.HS_CUSTOMER_AGENT_LEAD_STATUS
                HS_DATA_PRIVACY_ADS_CONSENT -> Known.HS_DATA_PRIVACY_ADS_CONSENT
                HS_DATE_ENTERED_CUSTOMER -> Known.HS_DATE_ENTERED_CUSTOMER
                HS_DATE_ENTERED_EVANGELIST -> Known.HS_DATE_ENTERED_EVANGELIST
                HS_DATE_ENTERED_LEAD -> Known.HS_DATE_ENTERED_LEAD
                HS_DATE_ENTERED_MARKETINGQUALIFIEDLEAD ->
                    Known.HS_DATE_ENTERED_MARKETINGQUALIFIEDLEAD
                HS_DATE_ENTERED_OPPORTUNITY -> Known.HS_DATE_ENTERED_OPPORTUNITY
                HS_DATE_ENTERED_OTHER -> Known.HS_DATE_ENTERED_OTHER
                HS_DATE_ENTERED_SALESQUALIFIEDLEAD -> Known.HS_DATE_ENTERED_SALESQUALIFIEDLEAD
                HS_DATE_ENTERED_SUBSCRIBER -> Known.HS_DATE_ENTERED_SUBSCRIBER
                HS_DATE_EXITED_CUSTOMER -> Known.HS_DATE_EXITED_CUSTOMER
                HS_DATE_EXITED_EVANGELIST -> Known.HS_DATE_EXITED_EVANGELIST
                HS_DATE_EXITED_LEAD -> Known.HS_DATE_EXITED_LEAD
                HS_DATE_EXITED_MARKETINGQUALIFIEDLEAD -> Known.HS_DATE_EXITED_MARKETINGQUALIFIEDLEAD
                HS_DATE_EXITED_OPPORTUNITY -> Known.HS_DATE_EXITED_OPPORTUNITY
                HS_DATE_EXITED_OTHER -> Known.HS_DATE_EXITED_OTHER
                HS_DATE_EXITED_SALESQUALIFIEDLEAD -> Known.HS_DATE_EXITED_SALESQUALIFIEDLEAD
                HS_DATE_EXITED_SUBSCRIBER -> Known.HS_DATE_EXITED_SUBSCRIBER
                HS_DOCUMENT_LAST_REVISITED -> Known.HS_DOCUMENT_LAST_REVISITED
                HS_EMAIL_BAD_ADDRESS -> Known.HS_EMAIL_BAD_ADDRESS
                HS_EMAIL_BOUNCE -> Known.HS_EMAIL_BOUNCE
                HS_EMAIL_CLICK -> Known.HS_EMAIL_CLICK
                HS_EMAIL_CUSTOMER_QUARANTINED_REASON -> Known.HS_EMAIL_CUSTOMER_QUARANTINED_REASON
                HS_EMAIL_DELIVERED -> Known.HS_EMAIL_DELIVERED
                HS_EMAIL_DOMAIN -> Known.HS_EMAIL_DOMAIN
                HS_EMAIL_FIRST_CLICK_DATE -> Known.HS_EMAIL_FIRST_CLICK_DATE
                HS_EMAIL_FIRST_OPEN_DATE -> Known.HS_EMAIL_FIRST_OPEN_DATE
                HS_EMAIL_FIRST_REPLY_DATE -> Known.HS_EMAIL_FIRST_REPLY_DATE
                HS_EMAIL_FIRST_SEND_DATE -> Known.HS_EMAIL_FIRST_SEND_DATE
                HS_EMAIL_HARD_BOUNCE_REASON -> Known.HS_EMAIL_HARD_BOUNCE_REASON
                HS_EMAIL_HARD_BOUNCE_REASON_ENUM -> Known.HS_EMAIL_HARD_BOUNCE_REASON_ENUM
                HS_EMAIL_IS_INELIGIBLE -> Known.HS_EMAIL_IS_INELIGIBLE
                HS_EMAIL_LAST_CLICK_DATE -> Known.HS_EMAIL_LAST_CLICK_DATE
                HS_EMAIL_LAST_EMAIL_NAME -> Known.HS_EMAIL_LAST_EMAIL_NAME
                HS_EMAIL_LAST_OPEN_DATE -> Known.HS_EMAIL_LAST_OPEN_DATE
                HS_EMAIL_LAST_REPLY_DATE -> Known.HS_EMAIL_LAST_REPLY_DATE
                HS_EMAIL_LAST_SEND_DATE -> Known.HS_EMAIL_LAST_SEND_DATE
                HS_EMAIL_LIVE_SOURCING_RESTRICTED -> Known.HS_EMAIL_LIVE_SOURCING_RESTRICTED
                HS_EMAIL_OPEN -> Known.HS_EMAIL_OPEN
                HS_EMAIL_OPTIMAL_SEND_DAY_OF_WEEK -> Known.HS_EMAIL_OPTIMAL_SEND_DAY_OF_WEEK
                HS_EMAIL_OPTIMAL_SEND_TIME_OF_DAY -> Known.HS_EMAIL_OPTIMAL_SEND_TIME_OF_DAY
                HS_EMAIL_OPTOUT -> Known.HS_EMAIL_OPTOUT
                HS_EMAIL_OPTOUT_SURVEY_REASON -> Known.HS_EMAIL_OPTOUT_SURVEY_REASON
                HS_EMAIL_QUARANTINED -> Known.HS_EMAIL_QUARANTINED
                HS_EMAIL_QUARANTINED_REASON -> Known.HS_EMAIL_QUARANTINED_REASON
                HS_EMAIL_RECIPIENT_FATIGUE_RECOVERY_TIME ->
                    Known.HS_EMAIL_RECIPIENT_FATIGUE_RECOVERY_TIME
                HS_EMAIL_REPLIED -> Known.HS_EMAIL_REPLIED
                HS_EMAIL_SENDS_SINCE_LAST_ENGAGEMENT -> Known.HS_EMAIL_SENDS_SINCE_LAST_ENGAGEMENT
                HS_EMAIL_TYPE -> Known.HS_EMAIL_TYPE
                HS_EMAILCONFIRMATIONSTATUS -> Known.HS_EMAILCONFIRMATIONSTATUS
                HS_EMPLOYMENT_CHANGE_DETECTED_DATE -> Known.HS_EMPLOYMENT_CHANGE_DETECTED_DATE
                HS_ENRICHED_EMAIL_BOUNCE_DETECTED -> Known.HS_ENRICHED_EMAIL_BOUNCE_DETECTED
                HS_FACEBOOK_AD_CLICKED -> Known.HS_FACEBOOK_AD_CLICKED
                HS_FACEBOOK_CLICK_ID -> Known.HS_FACEBOOK_CLICK_ID
                HS_FACEBOOKID -> Known.HS_FACEBOOKID
                HS_FEEDBACK_LAST_CES_SURVEY_DATE -> Known.HS_FEEDBACK_LAST_CES_SURVEY_DATE
                HS_FEEDBACK_LAST_CES_SURVEY_FOLLOW_UP -> Known.HS_FEEDBACK_LAST_CES_SURVEY_FOLLOW_UP
                HS_FEEDBACK_LAST_CES_SURVEY_RATING -> Known.HS_FEEDBACK_LAST_CES_SURVEY_RATING
                HS_FEEDBACK_LAST_CSAT_SURVEY_DATE -> Known.HS_FEEDBACK_LAST_CSAT_SURVEY_DATE
                HS_FEEDBACK_LAST_CSAT_SURVEY_FOLLOW_UP ->
                    Known.HS_FEEDBACK_LAST_CSAT_SURVEY_FOLLOW_UP
                HS_FEEDBACK_LAST_CSAT_SURVEY_RATING -> Known.HS_FEEDBACK_LAST_CSAT_SURVEY_RATING
                HS_FEEDBACK_LAST_NPS_FOLLOW_UP -> Known.HS_FEEDBACK_LAST_NPS_FOLLOW_UP
                HS_FEEDBACK_LAST_NPS_RATING -> Known.HS_FEEDBACK_LAST_NPS_RATING
                HS_FEEDBACK_LAST_NPS_RATING_NUMBER -> Known.HS_FEEDBACK_LAST_NPS_RATING_NUMBER
                HS_FEEDBACK_LAST_SURVEY_DATE -> Known.HS_FEEDBACK_LAST_SURVEY_DATE
                HS_FEEDBACK_SHOW_NPS_WEB_SURVEY -> Known.HS_FEEDBACK_SHOW_NPS_WEB_SURVEY
                HS_FIRST_CLOSED_ORDER_ID -> Known.HS_FIRST_CLOSED_ORDER_ID
                HS_FIRST_ENGAGEMENT_OBJECT_ID -> Known.HS_FIRST_ENGAGEMENT_OBJECT_ID
                HS_FIRST_ORDER_CLOSED_DATE -> Known.HS_FIRST_ORDER_CLOSED_DATE
                HS_FIRST_OUTREACH_DATE -> Known.HS_FIRST_OUTREACH_DATE
                HS_FIRST_SUBSCRIPTION_CREATE_DATE -> Known.HS_FIRST_SUBSCRIPTION_CREATE_DATE
                HS_FULL_NAME_OR_EMAIL -> Known.HS_FULL_NAME_OR_EMAIL
                HS_GOOGLE_CLICK_ID -> Known.HS_GOOGLE_CLICK_ID
                HS_GOOGLEPLUSID -> Known.HS_GOOGLEPLUSID
                HS_GPS_COORDINATES -> Known.HS_GPS_COORDINATES
                HS_GPS_ERROR -> Known.HS_GPS_ERROR
                HS_GPS_LATITUDE -> Known.HS_GPS_LATITUDE
                HS_GPS_LONGITUDE -> Known.HS_GPS_LONGITUDE
                HS_HAS_ACTIVE_SUBSCRIPTION -> Known.HS_HAS_ACTIVE_SUBSCRIPTION
                HS_INFERRED_LANGUAGE_CODES -> Known.HS_INFERRED_LANGUAGE_CODES
                HS_INTENT_PAID_UP_TO_DATE -> Known.HS_INTENT_PAID_UP_TO_DATE
                HS_INTENT_SIGNALS_ENABLED -> Known.HS_INTENT_SIGNALS_ENABLED
                HS_IP_TIMEZONE -> Known.HS_IP_TIMEZONE
                HS_IS_CONTACT -> Known.HS_IS_CONTACT
                HS_IS_ENRICHED -> Known.HS_IS_ENRICHED
                HS_IS_MERGE_REVERTIBLE -> Known.HS_IS_MERGE_REVERTIBLE
                HS_IS_UNWORKED -> Known.HS_IS_UNWORKED
                HS_JOB_CHANGE_DETECTED_DATE -> Known.HS_JOB_CHANGE_DETECTED_DATE
                HS_JOURNEY_STAGE -> Known.HS_JOURNEY_STAGE
                HS_LANGUAGE -> Known.HS_LANGUAGE
                HS_LAST_METERED_ENRICHMENT_TIMESTAMP -> Known.HS_LAST_METERED_ENRICHMENT_TIMESTAMP
                HS_LAST_SALES_ACTIVITY_DATE -> Known.HS_LAST_SALES_ACTIVITY_DATE
                HS_LAST_SALES_ACTIVITY_TIMESTAMP -> Known.HS_LAST_SALES_ACTIVITY_TIMESTAMP
                HS_LAST_SALES_ACTIVITY_TYPE -> Known.HS_LAST_SALES_ACTIVITY_TYPE
                HS_LAST_SMS_SEND_DATE -> Known.HS_LAST_SMS_SEND_DATE
                HS_LAST_SMS_SEND_NAME -> Known.HS_LAST_SMS_SEND_NAME
                HS_LATEST_DISQUALIFIED_LEAD_DATE -> Known.HS_LATEST_DISQUALIFIED_LEAD_DATE
                HS_LATEST_MEETING_ACTIVITY -> Known.HS_LATEST_MEETING_ACTIVITY
                HS_LATEST_OPEN_LEAD_DATE -> Known.HS_LATEST_OPEN_LEAD_DATE
                HS_LATEST_QUALIFIED_LEAD_DATE -> Known.HS_LATEST_QUALIFIED_LEAD_DATE
                HS_LATEST_SEQUENCE_ENDED_DATE -> Known.HS_LATEST_SEQUENCE_ENDED_DATE
                HS_LATEST_SEQUENCE_ENROLLED -> Known.HS_LATEST_SEQUENCE_ENROLLED
                HS_LATEST_SEQUENCE_ENROLLED_DATE -> Known.HS_LATEST_SEQUENCE_ENROLLED_DATE
                HS_LATEST_SEQUENCE_FINISHED_DATE -> Known.HS_LATEST_SEQUENCE_FINISHED_DATE
                HS_LATEST_SEQUENCE_UNENROLLED_DATE -> Known.HS_LATEST_SEQUENCE_UNENROLLED_DATE
                HS_LATEST_SOURCE -> Known.HS_LATEST_SOURCE
                HS_LATEST_SOURCE_COMPOSITE_DATA -> Known.HS_LATEST_SOURCE_COMPOSITE_DATA
                HS_LATEST_SOURCE_DATA_1 -> Known.HS_LATEST_SOURCE_DATA_1
                HS_LATEST_SOURCE_DATA_2 -> Known.HS_LATEST_SOURCE_DATA_2
                HS_LATEST_SOURCE_TIMESTAMP -> Known.HS_LATEST_SOURCE_TIMESTAMP
                HS_LATEST_SUBSCRIPTION_CREATE_DATE -> Known.HS_LATEST_SUBSCRIPTION_CREATE_DATE
                HS_LATITUDE -> Known.HS_LATITUDE
                HS_LEAD_STATUS -> Known.HS_LEAD_STATUS
                HS_LEGAL_BASIS -> Known.HS_LEGAL_BASIS
                HS_LIFECYCLESTAGE_CUSTOMER_DATE -> Known.HS_LIFECYCLESTAGE_CUSTOMER_DATE
                HS_LIFECYCLESTAGE_EVANGELIST_DATE -> Known.HS_LIFECYCLESTAGE_EVANGELIST_DATE
                HS_LIFECYCLESTAGE_LEAD_DATE -> Known.HS_LIFECYCLESTAGE_LEAD_DATE
                HS_LIFECYCLESTAGE_MARKETINGQUALIFIEDLEAD_DATE ->
                    Known.HS_LIFECYCLESTAGE_MARKETINGQUALIFIEDLEAD_DATE
                HS_LIFECYCLESTAGE_OPPORTUNITY_DATE -> Known.HS_LIFECYCLESTAGE_OPPORTUNITY_DATE
                HS_LIFECYCLESTAGE_OTHER_DATE -> Known.HS_LIFECYCLESTAGE_OTHER_DATE
                HS_LIFECYCLESTAGE_SALESQUALIFIEDLEAD_DATE ->
                    Known.HS_LIFECYCLESTAGE_SALESQUALIFIEDLEAD_DATE
                HS_LIFECYCLESTAGE_SUBSCRIBER_DATE -> Known.HS_LIFECYCLESTAGE_SUBSCRIBER_DATE
                HS_LINKEDIN_AD_CLICKED -> Known.HS_LINKEDIN_AD_CLICKED
                HS_LINKEDIN_CLICK_ID -> Known.HS_LINKEDIN_CLICK_ID
                HS_LINKEDIN_URL -> Known.HS_LINKEDIN_URL
                HS_LINKEDINID -> Known.HS_LINKEDINID
                HS_LIVE_ENRICHMENT_DEADLINE -> Known.HS_LIVE_ENRICHMENT_DEADLINE
                HS_LONGITUDE -> Known.HS_LONGITUDE
                HS_MANUAL_CAMPAIGN_IDS -> Known.HS_MANUAL_CAMPAIGN_IDS
                HS_MARKETABLE_REASON_ID -> Known.HS_MARKETABLE_REASON_ID
                HS_MARKETABLE_REASON_TYPE -> Known.HS_MARKETABLE_REASON_TYPE
                HS_MARKETABLE_STATUS -> Known.HS_MARKETABLE_STATUS
                HS_MARKETABLE_UNTIL_RENEWAL -> Known.HS_MARKETABLE_UNTIL_RENEWAL
                HS_MEMBERSHIP_HAS_ACCESSED_PRIVATE_CONTENT ->
                    Known.HS_MEMBERSHIP_HAS_ACCESSED_PRIVATE_CONTENT
                HS_MEMBERSHIP_LAST_PRIVATE_CONTENT_ACCESS_DATE ->
                    Known.HS_MEMBERSHIP_LAST_PRIVATE_CONTENT_ACCESS_DATE
                HS_MESSAGING_ENGAGEMENT_SCORE -> Known.HS_MESSAGING_ENGAGEMENT_SCORE
                HS_MOBILE_SDK_PUSH_TOKENS -> Known.HS_MOBILE_SDK_PUSH_TOKENS
                HS_NOTES_LAST_ACTIVITY -> Known.HS_NOTES_LAST_ACTIVITY
                HS_NOTES_NEXT_ACTIVITY -> Known.HS_NOTES_NEXT_ACTIVITY
                HS_NOTES_NEXT_ACTIVITY_TYPE -> Known.HS_NOTES_NEXT_ACTIVITY_TYPE
                HS_PERSONA -> Known.HS_PERSONA
                HS_PINNED_ENGAGEMENT_ID -> Known.HS_PINNED_ENGAGEMENT_ID
                HS_PIPELINE -> Known.HS_PIPELINE
                HS_PREDICTIVECONTACTSCORE -> Known.HS_PREDICTIVECONTACTSCORE
                HS_PREDICTIVECONTACTSCORE_TMP -> Known.HS_PREDICTIVECONTACTSCORE_TMP
                HS_PREDICTIVECONTACTSCORE_V2 -> Known.HS_PREDICTIVECONTACTSCORE_V2
                HS_PREDICTIVECONTACTSCOREBUCKET -> Known.HS_PREDICTIVECONTACTSCOREBUCKET
                HS_PREDICTIVESCORINGTIER -> Known.HS_PREDICTIVESCORINGTIER
                HS_PREDICTIVESCORINGTIER_TMP -> Known.HS_PREDICTIVESCORINGTIER_TMP
                HS_PROSPECTING_AGENT_ACTIVELY_ENROLLED_COUNT ->
                    Known.HS_PROSPECTING_AGENT_ACTIVELY_ENROLLED_COUNT
                HS_PROSPECTING_AGENT_LAST_ENROLLED -> Known.HS_PROSPECTING_AGENT_LAST_ENROLLED
                HS_PROSPECTING_AGENT_TOTAL_ENROLLED_COUNT ->
                    Known.HS_PROSPECTING_AGENT_TOTAL_ENROLLED_COUNT
                HS_QUARANTINED_EMAILS -> Known.HS_QUARANTINED_EMAILS
                HS_RECENT_CLOSED_ORDER_DATE -> Known.HS_RECENT_CLOSED_ORDER_DATE
                HS_REGISTERED_MEMBER -> Known.HS_REGISTERED_MEMBER
                HS_REGISTRATION_METHOD -> Known.HS_REGISTRATION_METHOD
                HS_RETURNING_TO_OFFICE_DETECTED_DATE -> Known.HS_RETURNING_TO_OFFICE_DETECTED_DATE
                HS_ROLE -> Known.HS_ROLE
                HS_SA_FIRST_ENGAGEMENT_DATE -> Known.HS_SA_FIRST_ENGAGEMENT_DATE
                HS_SA_FIRST_ENGAGEMENT_DESCR -> Known.HS_SA_FIRST_ENGAGEMENT_DESCR
                HS_SA_FIRST_ENGAGEMENT_OBJECT_TYPE -> Known.HS_SA_FIRST_ENGAGEMENT_OBJECT_TYPE
                HS_SALES_EMAIL_LAST_CLICKED -> Known.HS_SALES_EMAIL_LAST_CLICKED
                HS_SALES_EMAIL_LAST_OPENED -> Known.HS_SALES_EMAIL_LAST_OPENED
                HS_SALES_EMAIL_LAST_REPLIED -> Known.HS_SALES_EMAIL_LAST_REPLIED
                HS_SEARCHABLE_CALCULATED_INTERNATIONAL_MOBILE_NUMBER ->
                    Known.HS_SEARCHABLE_CALCULATED_INTERNATIONAL_MOBILE_NUMBER
                HS_SEARCHABLE_CALCULATED_INTERNATIONAL_PHONE_NUMBER ->
                    Known.HS_SEARCHABLE_CALCULATED_INTERNATIONAL_PHONE_NUMBER
                HS_SEARCHABLE_CALCULATED_MOBILE_NUMBER ->
                    Known.HS_SEARCHABLE_CALCULATED_MOBILE_NUMBER
                HS_SEARCHABLE_CALCULATED_PHONE_NUMBER -> Known.HS_SEARCHABLE_CALCULATED_PHONE_NUMBER
                HS_SENIORITY -> Known.HS_SENIORITY
                HS_SEQUENCES_ACTIVELY_ENROLLED_COUNT -> Known.HS_SEQUENCES_ACTIVELY_ENROLLED_COUNT
                HS_SEQUENCES_ENROLLED_COUNT -> Known.HS_SEQUENCES_ENROLLED_COUNT
                HS_SEQUENCES_IS_ENROLLED -> Known.HS_SEQUENCES_IS_ENROLLED
                HS_SOCIAL_FACEBOOK_CLICKS -> Known.HS_SOCIAL_FACEBOOK_CLICKS
                HS_SOCIAL_GOOGLE_PLUS_CLICKS -> Known.HS_SOCIAL_GOOGLE_PLUS_CLICKS
                HS_SOCIAL_LAST_ENGAGEMENT -> Known.HS_SOCIAL_LAST_ENGAGEMENT
                HS_SOCIAL_LINKEDIN_CLICKS -> Known.HS_SOCIAL_LINKEDIN_CLICKS
                HS_SOCIAL_NUM_BROADCAST_CLICKS -> Known.HS_SOCIAL_NUM_BROADCAST_CLICKS
                HS_SOCIAL_TWITTER_CLICKS -> Known.HS_SOCIAL_TWITTER_CLICKS
                HS_SOURCE_OBJECT_ID -> Known.HS_SOURCE_OBJECT_ID
                HS_SOURCE_PORTAL_ID -> Known.HS_SOURCE_PORTAL_ID
                HS_STATE_CODE -> Known.HS_STATE_CODE
                HS_SUB_ROLE -> Known.HS_SUB_ROLE
                HS_TESTPURGE -> Known.HS_TESTPURGE
                HS_TESTROLLBACK -> Known.HS_TESTROLLBACK
                HS_TIKTOK_AD_CLICKED -> Known.HS_TIKTOK_AD_CLICKED
                HS_TIKTOK_CLICK_ID -> Known.HS_TIKTOK_CLICK_ID
                HS_TIME_BETWEEN_CONTACT_CREATION_AND_DEAL_CLOSE ->
                    Known.HS_TIME_BETWEEN_CONTACT_CREATION_AND_DEAL_CLOSE
                HS_TIME_BETWEEN_CONTACT_CREATION_AND_DEAL_CREATION ->
                    Known.HS_TIME_BETWEEN_CONTACT_CREATION_AND_DEAL_CREATION
                HS_TIME_IN_CUSTOMER -> Known.HS_TIME_IN_CUSTOMER
                HS_TIME_IN_EVANGELIST -> Known.HS_TIME_IN_EVANGELIST
                HS_TIME_IN_LEAD -> Known.HS_TIME_IN_LEAD
                HS_TIME_IN_MARKETINGQUALIFIEDLEAD -> Known.HS_TIME_IN_MARKETINGQUALIFIEDLEAD
                HS_TIME_IN_OPPORTUNITY -> Known.HS_TIME_IN_OPPORTUNITY
                HS_TIME_IN_OTHER -> Known.HS_TIME_IN_OTHER
                HS_TIME_IN_SALESQUALIFIEDLEAD -> Known.HS_TIME_IN_SALESQUALIFIEDLEAD
                HS_TIME_IN_SUBSCRIBER -> Known.HS_TIME_IN_SUBSCRIBER
                HS_TIME_TO_FIRST_ENGAGEMENT -> Known.HS_TIME_TO_FIRST_ENGAGEMENT
                HS_TIME_TO_MOVE_FROM_LEAD_TO_CUSTOMER -> Known.HS_TIME_TO_MOVE_FROM_LEAD_TO_CUSTOMER
                HS_TIME_TO_MOVE_FROM_MARKETINGQUALIFIEDLEAD_TO_CUSTOMER ->
                    Known.HS_TIME_TO_MOVE_FROM_MARKETINGQUALIFIEDLEAD_TO_CUSTOMER
                HS_TIME_TO_MOVE_FROM_OPPORTUNITY_TO_CUSTOMER ->
                    Known.HS_TIME_TO_MOVE_FROM_OPPORTUNITY_TO_CUSTOMER
                HS_TIME_TO_MOVE_FROM_SALESQUALIFIEDLEAD_TO_CUSTOMER ->
                    Known.HS_TIME_TO_MOVE_FROM_SALESQUALIFIEDLEAD_TO_CUSTOMER
                HS_TIME_TO_MOVE_FROM_SUBSCRIBER_TO_CUSTOMER ->
                    Known.HS_TIME_TO_MOVE_FROM_SUBSCRIBER_TO_CUSTOMER
                HS_TIMEZONE -> Known.HS_TIMEZONE
                HS_TWITTERID -> Known.HS_TWITTERID
                HS_V2_CUMULATIVE_TIME_IN_CUSTOMER -> Known.HS_V2_CUMULATIVE_TIME_IN_CUSTOMER
                HS_V2_CUMULATIVE_TIME_IN_EVANGELIST -> Known.HS_V2_CUMULATIVE_TIME_IN_EVANGELIST
                HS_V2_CUMULATIVE_TIME_IN_LEAD -> Known.HS_V2_CUMULATIVE_TIME_IN_LEAD
                HS_V2_CUMULATIVE_TIME_IN_MARKETINGQUALIFIEDLEAD ->
                    Known.HS_V2_CUMULATIVE_TIME_IN_MARKETINGQUALIFIEDLEAD
                HS_V2_CUMULATIVE_TIME_IN_OPPORTUNITY -> Known.HS_V2_CUMULATIVE_TIME_IN_OPPORTUNITY
                HS_V2_CUMULATIVE_TIME_IN_OTHER -> Known.HS_V2_CUMULATIVE_TIME_IN_OTHER
                HS_V2_CUMULATIVE_TIME_IN_SALESQUALIFIEDLEAD ->
                    Known.HS_V2_CUMULATIVE_TIME_IN_SALESQUALIFIEDLEAD
                HS_V2_CUMULATIVE_TIME_IN_SUBSCRIBER -> Known.HS_V2_CUMULATIVE_TIME_IN_SUBSCRIBER
                HS_V2_DATE_ENTERED_CURRENT_STAGE -> Known.HS_V2_DATE_ENTERED_CURRENT_STAGE
                HS_V2_DATE_ENTERED_CUSTOMER -> Known.HS_V2_DATE_ENTERED_CUSTOMER
                HS_V2_DATE_ENTERED_EVANGELIST -> Known.HS_V2_DATE_ENTERED_EVANGELIST
                HS_V2_DATE_ENTERED_LEAD -> Known.HS_V2_DATE_ENTERED_LEAD
                HS_V2_DATE_ENTERED_MARKETINGQUALIFIEDLEAD ->
                    Known.HS_V2_DATE_ENTERED_MARKETINGQUALIFIEDLEAD
                HS_V2_DATE_ENTERED_OPPORTUNITY -> Known.HS_V2_DATE_ENTERED_OPPORTUNITY
                HS_V2_DATE_ENTERED_OTHER -> Known.HS_V2_DATE_ENTERED_OTHER
                HS_V2_DATE_ENTERED_SALESQUALIFIEDLEAD -> Known.HS_V2_DATE_ENTERED_SALESQUALIFIEDLEAD
                HS_V2_DATE_ENTERED_SUBSCRIBER -> Known.HS_V2_DATE_ENTERED_SUBSCRIBER
                HS_V2_DATE_EXITED_CUSTOMER -> Known.HS_V2_DATE_EXITED_CUSTOMER
                HS_V2_DATE_EXITED_EVANGELIST -> Known.HS_V2_DATE_EXITED_EVANGELIST
                HS_V2_DATE_EXITED_LEAD -> Known.HS_V2_DATE_EXITED_LEAD
                HS_V2_DATE_EXITED_MARKETINGQUALIFIEDLEAD ->
                    Known.HS_V2_DATE_EXITED_MARKETINGQUALIFIEDLEAD
                HS_V2_DATE_EXITED_OPPORTUNITY -> Known.HS_V2_DATE_EXITED_OPPORTUNITY
                HS_V2_DATE_EXITED_OTHER -> Known.HS_V2_DATE_EXITED_OTHER
                HS_V2_DATE_EXITED_SALESQUALIFIEDLEAD -> Known.HS_V2_DATE_EXITED_SALESQUALIFIEDLEAD
                HS_V2_DATE_EXITED_SUBSCRIBER -> Known.HS_V2_DATE_EXITED_SUBSCRIBER
                HS_V2_LATEST_TIME_IN_CUSTOMER -> Known.HS_V2_LATEST_TIME_IN_CUSTOMER
                HS_V2_LATEST_TIME_IN_EVANGELIST -> Known.HS_V2_LATEST_TIME_IN_EVANGELIST
                HS_V2_LATEST_TIME_IN_LEAD -> Known.HS_V2_LATEST_TIME_IN_LEAD
                HS_V2_LATEST_TIME_IN_MARKETINGQUALIFIEDLEAD ->
                    Known.HS_V2_LATEST_TIME_IN_MARKETINGQUALIFIEDLEAD
                HS_V2_LATEST_TIME_IN_OPPORTUNITY -> Known.HS_V2_LATEST_TIME_IN_OPPORTUNITY
                HS_V2_LATEST_TIME_IN_OTHER -> Known.HS_V2_LATEST_TIME_IN_OTHER
                HS_V2_LATEST_TIME_IN_SALESQUALIFIEDLEAD ->
                    Known.HS_V2_LATEST_TIME_IN_SALESQUALIFIEDLEAD
                HS_V2_LATEST_TIME_IN_SUBSCRIBER -> Known.HS_V2_LATEST_TIME_IN_SUBSCRIBER
                HS_V2_TIME_IN_CURRENT_STAGE -> Known.HS_V2_TIME_IN_CURRENT_STAGE
                HS_WHATSAPP_PHONE_NUMBER -> Known.HS_WHATSAPP_PHONE_NUMBER
                HUBSPOT_OWNER_ID -> Known.HUBSPOT_OWNER_ID
                HUBSPOTSCORE -> Known.HUBSPOTSCORE
                INDUSTRY -> Known.INDUSTRY
                IP_CITY -> Known.IP_CITY
                IP_COUNTRY -> Known.IP_COUNTRY
                IP_COUNTRY_CODE -> Known.IP_COUNTRY_CODE
                IP_LATLON -> Known.IP_LATLON
                IP_STATE -> Known.IP_STATE
                IP_STATE_CODE -> Known.IP_STATE_CODE
                IP_ZIPCODE -> Known.IP_ZIPCODE
                JOB_FUNCTION -> Known.JOB_FUNCTION
                JOBTITLE -> Known.JOBTITLE
                KLOUTSCOREGENERAL -> Known.KLOUTSCOREGENERAL
                LASTMODIFIEDDATE -> Known.LASTMODIFIEDDATE
                LASTNAME -> Known.LASTNAME
                LIFECYCLESTAGE -> Known.LIFECYCLESTAGE
                LINKEDINBIO -> Known.LINKEDINBIO
                LINKEDINCONNECTIONS -> Known.LINKEDINCONNECTIONS
                MARITAL_STATUS -> Known.MARITAL_STATUS
                MESSAGE -> Known.MESSAGE
                MILITARY_STATUS -> Known.MILITARY_STATUS
                MOBILEPHONE -> Known.MOBILEPHONE
                NOTES_LAST_CONTACTED -> Known.NOTES_LAST_CONTACTED
                NOTES_LAST_UPDATED -> Known.NOTES_LAST_UPDATED
                NOTES_NEXT_ACTIVITY_DATE -> Known.NOTES_NEXT_ACTIVITY_DATE
                NUM_ASSOCIATED_DEALS -> Known.NUM_ASSOCIATED_DEALS
                NUM_CONTACTED_NOTES -> Known.NUM_CONTACTED_NOTES
                NUM_CONVERSION_EVENTS -> Known.NUM_CONVERSION_EVENTS
                NUM_NOTES -> Known.NUM_NOTES
                NUM_UNIQUE_CONVERSION_EVENTS -> Known.NUM_UNIQUE_CONVERSION_EVENTS
                NUMEMPLOYEES -> Known.NUMEMPLOYEES
                OWNEREMAIL -> Known.OWNEREMAIL
                OWNERNAME -> Known.OWNERNAME
                PHONE -> Known.PHONE
                PHOTO -> Known.PHOTO
                RECENT_CONVERSION_DATE -> Known.RECENT_CONVERSION_DATE
                RECENT_CONVERSION_EVENT_NAME -> Known.RECENT_CONVERSION_EVENT_NAME
                RECENT_DEAL_AMOUNT -> Known.RECENT_DEAL_AMOUNT
                RECENT_DEAL_CLOSE_DATE -> Known.RECENT_DEAL_CLOSE_DATE
                RELATIONSHIP_STATUS -> Known.RELATIONSHIP_STATUS
                SALUTATION -> Known.SALUTATION
                SCHOOL -> Known.SCHOOL
                SENIORITY -> Known.SENIORITY
                START_DATE -> Known.START_DATE
                STATE -> Known.STATE
                SURVEYMONKEYEVENTLASTUPDATED -> Known.SURVEYMONKEYEVENTLASTUPDATED
                TOTAL_REVENUE -> Known.TOTAL_REVENUE
                TWITTERBIO -> Known.TWITTERBIO
                TWITTERHANDLE -> Known.TWITTERHANDLE
                TWITTERPROFILEPHOTO -> Known.TWITTERPROFILEPHOTO
                WEBINAREVENTLASTUPDATED -> Known.WEBINAREVENTLASTUPDATED
                WEBSITE -> Known.WEBSITE
                WORK_EMAIL -> Known.WORK_EMAIL
                ZIP -> Known.ZIP
                else ->
                    throw HubspotInvalidDataException(
                        "Unknown ContactPropertiesLeadingToMatch: $value"
                    )
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): ContactPropertiesLeadingToMatch = apply {
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
            } catch (e: HubspotInvalidDataException) {
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

            return other is ContactPropertiesLeadingToMatch && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreResolvedContact &&
            contactPropertiesLeadingToMatch == other.contactPropertiesLeadingToMatch &&
            contactVid == other.contactVid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(contactPropertiesLeadingToMatch, contactVid, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PreResolvedContact{contactPropertiesLeadingToMatch=$contactPropertiesLeadingToMatch, contactVid=$contactVid, additionalProperties=$additionalProperties}"
}
