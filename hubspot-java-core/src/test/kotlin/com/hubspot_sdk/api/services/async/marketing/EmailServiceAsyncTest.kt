// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.marketing.emails.AbTestCreateRequestVNext
import com.hubspot_sdk.api.models.marketing.emails.EmailCloneRequestVNext
import com.hubspot_sdk.api.models.marketing.emails.EmailCreateRequest
import com.hubspot_sdk.api.models.marketing.emails.EmailDeleteParams
import com.hubspot_sdk.api.models.marketing.emails.EmailGetAbTestVariationParams
import com.hubspot_sdk.api.models.marketing.emails.EmailGetHistogramParams
import com.hubspot_sdk.api.models.marketing.emails.EmailGetParams
import com.hubspot_sdk.api.models.marketing.emails.EmailGetRevisionParams
import com.hubspot_sdk.api.models.marketing.emails.EmailRestoreRevisionParams
import com.hubspot_sdk.api.models.marketing.emails.EmailRestoreRevisionToDraftParams
import com.hubspot_sdk.api.models.marketing.emails.EmailUpdateDraftParams
import com.hubspot_sdk.api.models.marketing.emails.EmailUpdateParams
import com.hubspot_sdk.api.models.marketing.emails.EmailUpdateRequest
import com.hubspot_sdk.api.models.marketing.emails.PublicButtonStyleSettings
import com.hubspot_sdk.api.models.marketing.emails.PublicDividerStyleSettings
import com.hubspot_sdk.api.models.marketing.emails.PublicEmailContent
import com.hubspot_sdk.api.models.marketing.emails.PublicEmailFromDetails
import com.hubspot_sdk.api.models.marketing.emails.PublicEmailRecipients
import com.hubspot_sdk.api.models.marketing.emails.PublicEmailStyleSettings
import com.hubspot_sdk.api.models.marketing.emails.PublicEmailSubscriptionDetails
import com.hubspot_sdk.api.models.marketing.emails.PublicEmailTestingDetails
import com.hubspot_sdk.api.models.marketing.emails.PublicEmailToDetails
import com.hubspot_sdk.api.models.marketing.emails.PublicFontStyle
import com.hubspot_sdk.api.models.marketing.emails.PublicRssEmailDetails
import com.hubspot_sdk.api.models.marketing.emails.PublicWebversionDetails
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val emailServiceAsync = client.marketing().emails()

        val publicEmailFuture =
            emailServiceAsync.create(
                EmailCreateRequest.builder()
                    .activeDomain("activeDomain")
                    .archived(true)
                    .businessUnitId(0L)
                    .campaign("campaign")
                    .content(
                        PublicEmailContent.builder()
                            .flexAreas(
                                PublicEmailContent.FlexAreas.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .plainTextVersion("plainTextVersion")
                            .smartFields(
                                PublicEmailContent.SmartFields.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .styleSettings(
                                PublicEmailStyleSettings.builder()
                                    .backgroundColor("backgroundColor")
                                    .backgroundImage("backgroundImage")
                                    .backgroundImageType(
                                        PublicEmailStyleSettings.BackgroundImageType.REPEAT
                                    )
                                    .bodyBorderColor("bodyBorderColor")
                                    .bodyBorderColorChoice("bodyBorderColorChoice")
                                    .bodyBorderWidth(0.0)
                                    .bodyColor("bodyColor")
                                    .buttonStyleSettings(
                                        PublicButtonStyleSettings.builder()
                                            .backgroundColor(JsonValue.from(mapOf<String, Any>()))
                                            .cornerRadius(0)
                                            .fontStyle(
                                                PublicFontStyle.builder()
                                                    .bold(true)
                                                    .color("color")
                                                    .font("font")
                                                    .italic(true)
                                                    .size(0)
                                                    .underline(true)
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .colorPickerFavorite1("colorPickerFavorite1")
                                    .colorPickerFavorite2("colorPickerFavorite2")
                                    .colorPickerFavorite3("colorPickerFavorite3")
                                    .colorPickerFavorite4("colorPickerFavorite4")
                                    .colorPickerFavorite5("colorPickerFavorite5")
                                    .colorPickerFavorite6("colorPickerFavorite6")
                                    .dividerStyleSettings(
                                        PublicDividerStyleSettings.builder()
                                            .color(JsonValue.from(mapOf<String, Any>()))
                                            .height(0)
                                            .lineType("lineType")
                                            .build()
                                    )
                                    .emailBodyPadding("emailBodyPadding")
                                    .emailBodyWidth("emailBodyWidth")
                                    .headingOneFont(
                                        PublicFontStyle.builder()
                                            .bold(true)
                                            .color("color")
                                            .font("font")
                                            .italic(true)
                                            .size(0)
                                            .underline(true)
                                            .build()
                                    )
                                    .headingTwoFont(
                                        PublicFontStyle.builder()
                                            .bold(true)
                                            .color("color")
                                            .font("font")
                                            .italic(true)
                                            .size(0)
                                            .underline(true)
                                            .build()
                                    )
                                    .linksFont(
                                        PublicFontStyle.builder()
                                            .bold(true)
                                            .color("color")
                                            .font("font")
                                            .italic(true)
                                            .size(0)
                                            .underline(true)
                                            .build()
                                    )
                                    .primaryAccentColor("primaryAccentColor")
                                    .primaryFont("primaryFont")
                                    .primaryFontColor("primaryFontColor")
                                    .primaryFontLineHeight("primaryFontLineHeight")
                                    .primaryFontSize(0.0)
                                    .secondaryAccentColor("secondaryAccentColor")
                                    .secondaryFont("secondaryFont")
                                    .secondaryFontColor("secondaryFontColor")
                                    .secondaryFontLineHeight("secondaryFontLineHeight")
                                    .secondaryFontSize(0.0)
                                    .build()
                            )
                            .templatePath("templatePath")
                            .themeSettingsValues(
                                PublicEmailContent.ThemeSettingsValues.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .widgetContainers(
                                PublicEmailContent.WidgetContainers.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .widgets(
                                PublicEmailContent.Widgets.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .feedbackSurveyId("feedbackSurveyId")
                    .folderIdV2(0L)
                    .from(
                        PublicEmailFromDetails.builder()
                            .customReplyTo("customReplyTo")
                            .fromName("fromName")
                            .replyTo("replyTo")
                            .build()
                    )
                    .jitterSendTime(true)
                    .language(EmailCreateRequest.Language.AA)
                    .name("name")
                    .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .rssData(
                        PublicRssEmailDetails.builder()
                            .blogEmailType("blogEmailType")
                            .blogImageMaxWidth(0)
                            .blogLayout(PublicRssEmailDetails.BlogLayout.FULL_POST)
                            .hubspotBlogId("hubspotBlogId")
                            .maxEntries(0)
                            .rssEntryTemplate("rssEntryTemplate")
                            .timing(
                                PublicRssEmailDetails.Timing.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .url("url")
                            .useHeadlineAsSubject(true)
                            .build()
                    )
                    .sendOnPublish(true)
                    .state(EmailCreateRequest.State.AGENT_GENERATED)
                    .subcategory(EmailCreateRequest.Subcategory.AB_LOSER_VARIANT)
                    .subject("subject")
                    .subscriptionDetails(
                        PublicEmailSubscriptionDetails.builder()
                            .officeLocationId("officeLocationId")
                            .preferencesGroupId("preferencesGroupId")
                            .subscriptionId("subscriptionId")
                            .subscriptionName("subscriptionName")
                            .build()
                    )
                    .testing(
                        PublicEmailTestingDetails.builder()
                            .isAbVariation(true)
                            .abSampleSizeDefault(
                                PublicEmailTestingDetails.AbSampleSizeDefault
                                    .AUTOMATED_LOSER_VARIANT
                            )
                            .abSamplingDefault(
                                PublicEmailTestingDetails.AbSamplingDefault.AUTOMATED_LOSER_VARIANT
                            )
                            .abStatus(PublicEmailTestingDetails.AbStatus.AUTOMATED_LOSER_VARIANT)
                            .abSuccessMetric(
                                PublicEmailTestingDetails.AbSuccessMetric.CLICKS_BY_DELIVERED
                            )
                            .abTestPercentage(0)
                            .hoursToWait(0)
                            .testId("testId")
                            .build()
                    )
                    .to(
                        PublicEmailToDetails.builder()
                            .contactIds(
                                PublicEmailRecipients.builder()
                                    .addExclude("string")
                                    .addInclude("string")
                                    .build()
                            )
                            .contactIlsLists(
                                PublicEmailRecipients.builder()
                                    .addExclude("string")
                                    .addInclude("string")
                                    .build()
                            )
                            .contactLists(
                                PublicEmailRecipients.builder()
                                    .addExclude("string")
                                    .addInclude("string")
                                    .build()
                            )
                            .limitSendFrequency(true)
                            .suppressGraymail(true)
                            .build()
                    )
                    .webversion(
                        PublicWebversionDetails.builder()
                            .domain("domain")
                            .enabled(true)
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .isPageRedirected(true)
                            .metaDescription("metaDescription")
                            .pageExpiryEnabled(true)
                            .redirectToPageId("redirectToPageId")
                            .redirectToUrl("redirectToUrl")
                            .slug("slug")
                            .title("title")
                            .url("url")
                            .build()
                    )
                    .build()
            )

        val publicEmail = publicEmailFuture.get()
        publicEmail.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val emailServiceAsync = client.marketing().emails()

        val publicEmailFuture =
            emailServiceAsync.update(
                EmailUpdateParams.builder()
                    .emailId("emailId")
                    .queryArchived(true)
                    .emailUpdateRequest(
                        EmailUpdateRequest.builder()
                            .activeDomain("activeDomain")
                            .archived(true)
                            .businessUnitId(0L)
                            .campaign("campaign")
                            .content(
                                PublicEmailContent.builder()
                                    .flexAreas(
                                        PublicEmailContent.FlexAreas.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .plainTextVersion("plainTextVersion")
                                    .smartFields(
                                        PublicEmailContent.SmartFields.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .styleSettings(
                                        PublicEmailStyleSettings.builder()
                                            .backgroundColor("backgroundColor")
                                            .backgroundImage("backgroundImage")
                                            .backgroundImageType(
                                                PublicEmailStyleSettings.BackgroundImageType.REPEAT
                                            )
                                            .bodyBorderColor("bodyBorderColor")
                                            .bodyBorderColorChoice("bodyBorderColorChoice")
                                            .bodyBorderWidth(0.0)
                                            .bodyColor("bodyColor")
                                            .buttonStyleSettings(
                                                PublicButtonStyleSettings.builder()
                                                    .backgroundColor(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
                                                    .cornerRadius(0)
                                                    .fontStyle(
                                                        PublicFontStyle.builder()
                                                            .bold(true)
                                                            .color("color")
                                                            .font("font")
                                                            .italic(true)
                                                            .size(0)
                                                            .underline(true)
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .colorPickerFavorite1("colorPickerFavorite1")
                                            .colorPickerFavorite2("colorPickerFavorite2")
                                            .colorPickerFavorite3("colorPickerFavorite3")
                                            .colorPickerFavorite4("colorPickerFavorite4")
                                            .colorPickerFavorite5("colorPickerFavorite5")
                                            .colorPickerFavorite6("colorPickerFavorite6")
                                            .dividerStyleSettings(
                                                PublicDividerStyleSettings.builder()
                                                    .color(JsonValue.from(mapOf<String, Any>()))
                                                    .height(0)
                                                    .lineType("lineType")
                                                    .build()
                                            )
                                            .emailBodyPadding("emailBodyPadding")
                                            .emailBodyWidth("emailBodyWidth")
                                            .headingOneFont(
                                                PublicFontStyle.builder()
                                                    .bold(true)
                                                    .color("color")
                                                    .font("font")
                                                    .italic(true)
                                                    .size(0)
                                                    .underline(true)
                                                    .build()
                                            )
                                            .headingTwoFont(
                                                PublicFontStyle.builder()
                                                    .bold(true)
                                                    .color("color")
                                                    .font("font")
                                                    .italic(true)
                                                    .size(0)
                                                    .underline(true)
                                                    .build()
                                            )
                                            .linksFont(
                                                PublicFontStyle.builder()
                                                    .bold(true)
                                                    .color("color")
                                                    .font("font")
                                                    .italic(true)
                                                    .size(0)
                                                    .underline(true)
                                                    .build()
                                            )
                                            .primaryAccentColor("primaryAccentColor")
                                            .primaryFont("primaryFont")
                                            .primaryFontColor("primaryFontColor")
                                            .primaryFontLineHeight("primaryFontLineHeight")
                                            .primaryFontSize(0.0)
                                            .secondaryAccentColor("secondaryAccentColor")
                                            .secondaryFont("secondaryFont")
                                            .secondaryFontColor("secondaryFontColor")
                                            .secondaryFontLineHeight("secondaryFontLineHeight")
                                            .secondaryFontSize(0.0)
                                            .build()
                                    )
                                    .templatePath("templatePath")
                                    .themeSettingsValues(
                                        PublicEmailContent.ThemeSettingsValues.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .widgetContainers(
                                        PublicEmailContent.WidgetContainers.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .widgets(
                                        PublicEmailContent.Widgets.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .folderIdV2(0L)
                            .from(
                                PublicEmailFromDetails.builder()
                                    .customReplyTo("customReplyTo")
                                    .fromName("fromName")
                                    .replyTo("replyTo")
                                    .build()
                            )
                            .jitterSendTime(true)
                            .language(EmailUpdateRequest.Language.AA)
                            .name("name")
                            .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .rssData(
                                PublicRssEmailDetails.builder()
                                    .blogEmailType("blogEmailType")
                                    .blogImageMaxWidth(0)
                                    .blogLayout(PublicRssEmailDetails.BlogLayout.FULL_POST)
                                    .hubspotBlogId("hubspotBlogId")
                                    .maxEntries(0)
                                    .rssEntryTemplate("rssEntryTemplate")
                                    .timing(
                                        PublicRssEmailDetails.Timing.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .url("url")
                                    .useHeadlineAsSubject(true)
                                    .build()
                            )
                            .sendOnPublish(true)
                            .state(EmailUpdateRequest.State.AGENT_GENERATED)
                            .subcategory(EmailUpdateRequest.Subcategory.AB_LOSER_VARIANT)
                            .subject("subject")
                            .subscriptionDetails(
                                PublicEmailSubscriptionDetails.builder()
                                    .officeLocationId("officeLocationId")
                                    .preferencesGroupId("preferencesGroupId")
                                    .subscriptionId("subscriptionId")
                                    .subscriptionName("subscriptionName")
                                    .build()
                            )
                            .testing(
                                PublicEmailTestingDetails.builder()
                                    .isAbVariation(true)
                                    .abSampleSizeDefault(
                                        PublicEmailTestingDetails.AbSampleSizeDefault
                                            .AUTOMATED_LOSER_VARIANT
                                    )
                                    .abSamplingDefault(
                                        PublicEmailTestingDetails.AbSamplingDefault
                                            .AUTOMATED_LOSER_VARIANT
                                    )
                                    .abStatus(
                                        PublicEmailTestingDetails.AbStatus.AUTOMATED_LOSER_VARIANT
                                    )
                                    .abSuccessMetric(
                                        PublicEmailTestingDetails.AbSuccessMetric
                                            .CLICKS_BY_DELIVERED
                                    )
                                    .abTestPercentage(0)
                                    .hoursToWait(0)
                                    .testId("testId")
                                    .build()
                            )
                            .to(
                                PublicEmailToDetails.builder()
                                    .contactIds(
                                        PublicEmailRecipients.builder()
                                            .addExclude("string")
                                            .addInclude("string")
                                            .build()
                                    )
                                    .contactIlsLists(
                                        PublicEmailRecipients.builder()
                                            .addExclude("string")
                                            .addInclude("string")
                                            .build()
                                    )
                                    .contactLists(
                                        PublicEmailRecipients.builder()
                                            .addExclude("string")
                                            .addInclude("string")
                                            .build()
                                    )
                                    .limitSendFrequency(true)
                                    .suppressGraymail(true)
                                    .build()
                            )
                            .webversion(
                                PublicWebversionDetails.builder()
                                    .domain("domain")
                                    .enabled(true)
                                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .isPageRedirected(true)
                                    .metaDescription("metaDescription")
                                    .pageExpiryEnabled(true)
                                    .redirectToPageId("redirectToPageId")
                                    .redirectToUrl("redirectToUrl")
                                    .slug("slug")
                                    .title("title")
                                    .url("url")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val publicEmail = publicEmailFuture.get()
        publicEmail.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val emailServiceAsync = client.marketing().emails()

        val pageFuture = emailServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val emailServiceAsync = client.marketing().emails()

        val future =
            emailServiceAsync.delete(
                EmailDeleteParams.builder().emailId("emailId").archived(true).build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun clone() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val emailServiceAsync = client.marketing().emails()

        val publicEmailFuture =
            emailServiceAsync.clone(
                EmailCloneRequestVNext.builder()
                    .id("id")
                    .cloneName("cloneName")
                    .language("language")
                    .build()
            )

        val publicEmail = publicEmailFuture.get()
        publicEmail.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createAbTestVariation() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val emailServiceAsync = client.marketing().emails()

        val publicEmailFuture =
            emailServiceAsync.createAbTestVariation(
                AbTestCreateRequestVNext.builder()
                    .contentId("contentId")
                    .variationName("variationName")
                    .build()
            )

        val publicEmail = publicEmailFuture.get()
        publicEmail.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val emailServiceAsync = client.marketing().emails()

        val aggregateEmailStatisticsFuture =
            emailServiceAsync.get(
                EmailGetParams.builder()
                    .addEmailId(0L)
                    .endTimestamp("endTimestamp")
                    .property("property")
                    .startTimestamp("startTimestamp")
                    .build()
            )

        val aggregateEmailStatistics = aggregateEmailStatisticsFuture.get()
        aggregateEmailStatistics.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAbTestVariation() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val emailServiceAsync = client.marketing().emails()

        val publicEmailFuture =
            emailServiceAsync.getAbTestVariation(
                EmailGetAbTestVariationParams.builder()
                    .emailId("emailId")
                    .archived(true)
                    .addIncludedProperty("string")
                    .includeStats(true)
                    .marketingCampaignNames(true)
                    .variantStats(true)
                    .workflowNames(true)
                    .build()
            )

        val publicEmail = publicEmailFuture.get()
        publicEmail.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDraft() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val emailServiceAsync = client.marketing().emails()

        val publicEmailFuture = emailServiceAsync.getDraft("emailId")

        val publicEmail = publicEmailFuture.get()
        publicEmail.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getHistogram() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val emailServiceAsync = client.marketing().emails()

        val collectionResponseWithTotalEmailStatisticIntervalFuture =
            emailServiceAsync.getHistogram(
                EmailGetHistogramParams.builder()
                    .addEmailId(0L)
                    .endTimestamp("endTimestamp")
                    .interval(EmailGetHistogramParams.Interval.DAY)
                    .startTimestamp("startTimestamp")
                    .build()
            )

        val collectionResponseWithTotalEmailStatisticInterval =
            collectionResponseWithTotalEmailStatisticIntervalFuture.get()
        collectionResponseWithTotalEmailStatisticInterval.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRevision() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val emailServiceAsync = client.marketing().emails()

        val publicEmailVersionFuture =
            emailServiceAsync.getRevision(
                EmailGetRevisionParams.builder().emailId("emailId").revisionId("revisionId").build()
            )

        val publicEmailVersion = publicEmailVersionFuture.get()
        publicEmailVersion.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listRevisions() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val emailServiceAsync = client.marketing().emails()

        val pageFuture = emailServiceAsync.listRevisions("emailId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun publish() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val emailServiceAsync = client.marketing().emails()

        val future = emailServiceAsync.publish("emailId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun resetDraft() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val emailServiceAsync = client.marketing().emails()

        val future = emailServiceAsync.resetDraft("emailId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreRevision() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val emailServiceAsync = client.marketing().emails()

        val future =
            emailServiceAsync.restoreRevision(
                EmailRestoreRevisionParams.builder()
                    .emailId("emailId")
                    .revisionId("revisionId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreRevisionToDraft() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val emailServiceAsync = client.marketing().emails()

        val publicEmailFuture =
            emailServiceAsync.restoreRevisionToDraft(
                EmailRestoreRevisionToDraftParams.builder()
                    .emailId("emailId")
                    .revisionId(0L)
                    .build()
            )

        val publicEmail = publicEmailFuture.get()
        publicEmail.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unpublish() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val emailServiceAsync = client.marketing().emails()

        val future = emailServiceAsync.unpublish("emailId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateDraft() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val emailServiceAsync = client.marketing().emails()

        val publicEmailFuture =
            emailServiceAsync.updateDraft(
                EmailUpdateDraftParams.builder()
                    .emailId("emailId")
                    .emailUpdateRequest(
                        EmailUpdateRequest.builder()
                            .activeDomain("activeDomain")
                            .archived(true)
                            .businessUnitId(0L)
                            .campaign("campaign")
                            .content(
                                PublicEmailContent.builder()
                                    .flexAreas(
                                        PublicEmailContent.FlexAreas.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .plainTextVersion("plainTextVersion")
                                    .smartFields(
                                        PublicEmailContent.SmartFields.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .styleSettings(
                                        PublicEmailStyleSettings.builder()
                                            .backgroundColor("backgroundColor")
                                            .backgroundImage("backgroundImage")
                                            .backgroundImageType(
                                                PublicEmailStyleSettings.BackgroundImageType.REPEAT
                                            )
                                            .bodyBorderColor("bodyBorderColor")
                                            .bodyBorderColorChoice("bodyBorderColorChoice")
                                            .bodyBorderWidth(0.0)
                                            .bodyColor("bodyColor")
                                            .buttonStyleSettings(
                                                PublicButtonStyleSettings.builder()
                                                    .backgroundColor(
                                                        JsonValue.from(mapOf<String, Any>())
                                                    )
                                                    .cornerRadius(0)
                                                    .fontStyle(
                                                        PublicFontStyle.builder()
                                                            .bold(true)
                                                            .color("color")
                                                            .font("font")
                                                            .italic(true)
                                                            .size(0)
                                                            .underline(true)
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .colorPickerFavorite1("colorPickerFavorite1")
                                            .colorPickerFavorite2("colorPickerFavorite2")
                                            .colorPickerFavorite3("colorPickerFavorite3")
                                            .colorPickerFavorite4("colorPickerFavorite4")
                                            .colorPickerFavorite5("colorPickerFavorite5")
                                            .colorPickerFavorite6("colorPickerFavorite6")
                                            .dividerStyleSettings(
                                                PublicDividerStyleSettings.builder()
                                                    .color(JsonValue.from(mapOf<String, Any>()))
                                                    .height(0)
                                                    .lineType("lineType")
                                                    .build()
                                            )
                                            .emailBodyPadding("emailBodyPadding")
                                            .emailBodyWidth("emailBodyWidth")
                                            .headingOneFont(
                                                PublicFontStyle.builder()
                                                    .bold(true)
                                                    .color("color")
                                                    .font("font")
                                                    .italic(true)
                                                    .size(0)
                                                    .underline(true)
                                                    .build()
                                            )
                                            .headingTwoFont(
                                                PublicFontStyle.builder()
                                                    .bold(true)
                                                    .color("color")
                                                    .font("font")
                                                    .italic(true)
                                                    .size(0)
                                                    .underline(true)
                                                    .build()
                                            )
                                            .linksFont(
                                                PublicFontStyle.builder()
                                                    .bold(true)
                                                    .color("color")
                                                    .font("font")
                                                    .italic(true)
                                                    .size(0)
                                                    .underline(true)
                                                    .build()
                                            )
                                            .primaryAccentColor("primaryAccentColor")
                                            .primaryFont("primaryFont")
                                            .primaryFontColor("primaryFontColor")
                                            .primaryFontLineHeight("primaryFontLineHeight")
                                            .primaryFontSize(0.0)
                                            .secondaryAccentColor("secondaryAccentColor")
                                            .secondaryFont("secondaryFont")
                                            .secondaryFontColor("secondaryFontColor")
                                            .secondaryFontLineHeight("secondaryFontLineHeight")
                                            .secondaryFontSize(0.0)
                                            .build()
                                    )
                                    .templatePath("templatePath")
                                    .themeSettingsValues(
                                        PublicEmailContent.ThemeSettingsValues.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .widgetContainers(
                                        PublicEmailContent.WidgetContainers.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .widgets(
                                        PublicEmailContent.Widgets.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .folderIdV2(0L)
                            .from(
                                PublicEmailFromDetails.builder()
                                    .customReplyTo("customReplyTo")
                                    .fromName("fromName")
                                    .replyTo("replyTo")
                                    .build()
                            )
                            .jitterSendTime(true)
                            .language(EmailUpdateRequest.Language.AA)
                            .name("name")
                            .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .rssData(
                                PublicRssEmailDetails.builder()
                                    .blogEmailType("blogEmailType")
                                    .blogImageMaxWidth(0)
                                    .blogLayout(PublicRssEmailDetails.BlogLayout.FULL_POST)
                                    .hubspotBlogId("hubspotBlogId")
                                    .maxEntries(0)
                                    .rssEntryTemplate("rssEntryTemplate")
                                    .timing(
                                        PublicRssEmailDetails.Timing.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .url("url")
                                    .useHeadlineAsSubject(true)
                                    .build()
                            )
                            .sendOnPublish(true)
                            .state(EmailUpdateRequest.State.AGENT_GENERATED)
                            .subcategory(EmailUpdateRequest.Subcategory.AB_LOSER_VARIANT)
                            .subject("subject")
                            .subscriptionDetails(
                                PublicEmailSubscriptionDetails.builder()
                                    .officeLocationId("officeLocationId")
                                    .preferencesGroupId("preferencesGroupId")
                                    .subscriptionId("subscriptionId")
                                    .subscriptionName("subscriptionName")
                                    .build()
                            )
                            .testing(
                                PublicEmailTestingDetails.builder()
                                    .isAbVariation(true)
                                    .abSampleSizeDefault(
                                        PublicEmailTestingDetails.AbSampleSizeDefault
                                            .AUTOMATED_LOSER_VARIANT
                                    )
                                    .abSamplingDefault(
                                        PublicEmailTestingDetails.AbSamplingDefault
                                            .AUTOMATED_LOSER_VARIANT
                                    )
                                    .abStatus(
                                        PublicEmailTestingDetails.AbStatus.AUTOMATED_LOSER_VARIANT
                                    )
                                    .abSuccessMetric(
                                        PublicEmailTestingDetails.AbSuccessMetric
                                            .CLICKS_BY_DELIVERED
                                    )
                                    .abTestPercentage(0)
                                    .hoursToWait(0)
                                    .testId("testId")
                                    .build()
                            )
                            .to(
                                PublicEmailToDetails.builder()
                                    .contactIds(
                                        PublicEmailRecipients.builder()
                                            .addExclude("string")
                                            .addInclude("string")
                                            .build()
                                    )
                                    .contactIlsLists(
                                        PublicEmailRecipients.builder()
                                            .addExclude("string")
                                            .addInclude("string")
                                            .build()
                                    )
                                    .contactLists(
                                        PublicEmailRecipients.builder()
                                            .addExclude("string")
                                            .addInclude("string")
                                            .build()
                                    )
                                    .limitSendFrequency(true)
                                    .suppressGraymail(true)
                                    .build()
                            )
                            .webversion(
                                PublicWebversionDetails.builder()
                                    .domain("domain")
                                    .enabled(true)
                                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .isPageRedirected(true)
                                    .metaDescription("metaDescription")
                                    .pageExpiryEnabled(true)
                                    .redirectToPageId("redirectToPageId")
                                    .redirectToUrl("redirectToUrl")
                                    .slug("slug")
                                    .title("title")
                                    .url("url")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val publicEmail = publicEmailFuture.get()
        publicEmail.validate()
    }
}
