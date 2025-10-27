// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.AbTestCreateRequestVNext
import com.hubspot_sdk.api.models.marketing.emails.EmailCloneRequestVNext
import com.hubspot_sdk.api.models.marketing.emails.EmailCreateRequest
import com.hubspot_sdk.api.models.marketing.emails.EmailDeleteParams
import com.hubspot_sdk.api.models.marketing.emails.EmailGetParams
import com.hubspot_sdk.api.models.marketing.emails.EmailGetRevisionParams
import com.hubspot_sdk.api.models.marketing.emails.EmailListRevisionsParams
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
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EmailServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val emailServiceAsync = client.marketing().emails()

        val publicEmailFuture =
            emailServiceAsync.create(
                EmailCreateRequest.builder()
                    .name("My subject")
                    .activeDomain("test.hs-sites.com")
                    .archived(false)
                    .businessUnitId(0L)
                    .campaign("1b7f51a6-33c1-44d6-ba28-fe81f655dced")
                    .content(
                        PublicEmailContent.builder()
                            .flexAreas(
                                PublicEmailContent.FlexAreas.builder()
                                    .putAdditionalProperty(
                                        "main",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .plainTextVersion(
                                "This is custom! View in browser ({{view_as_page_url}})\n\nHello {{ contact.firstname }},\n\nPlain text emails have minimal formatting so your reader can really focus on what you have to say. Introduce yourself and explain why you’re reaching out.\n\nEvery email should try to lead the reader to some kind of action. Use this space to describe why the reader should want to click on the link below. Put the link on its own line to really draw their eye to it.\n\nLink text\n\nNow it’s time to wrap up your email. Before your signature, thank the recipient for reading. You can also invite them to send this email to any of their colleagues who might be interested.\n\nAll the best,\n\nYour full name\n\nYour job title\n\nOther contact information\n\n{{site_settings.company_name}}, {{site_settings.company_street_address_1}}, {{site_settings.company_street_address_2}}, {{site_settings.company_city}}, {{site_settings.company_state}} {{site_settings.company_zip}}, {{site_settings.company_country}}, {{site_settings.company_phone}}\n\nUnsubscribe ({{unsubscribe_link_all}})\n\nManage preferences ({{unsubscribe_link}})"
                            )
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
                                    .backgroundImageType("backgroundImageType")
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
                                        "module-0-1-1",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .putAdditionalProperty(
                                        "module-1-1-1",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .putAdditionalProperty(
                                        "module_160676180617911",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .putAdditionalProperty(
                                        "preview_text",
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
                            .fromName("Bruce Wayne")
                            .replyTo("test@hubspot.com")
                            .build()
                    )
                    .jitterSendTime(true)
                    .language(EmailCreateRequest.Language.AF)
                    .publishDate(OffsetDateTime.parse("2023-11-30T18:44:20.387Z"))
                    .rssData(
                        PublicRssEmailDetails.builder()
                            .blogEmailType("blogEmailType")
                            .blogImageMaxWidth(0)
                            .blogLayout("blogLayout")
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
                    .state(EmailCreateRequest.State.DRAFT)
                    .subcategory(EmailCreateRequest.Subcategory.BATCH)
                    .subject("My subject")
                    .subscriptionDetails(
                        PublicEmailSubscriptionDetails.builder()
                            .officeLocationId("5449392956")
                            .preferencesGroupId("preferencesGroupId")
                            .subscriptionId("subscriptionId")
                            .subscriptionName("subscriptionName")
                            .build()
                    )
                    .testing(
                        PublicEmailTestingDetails.builder()
                            .abSampleSizeDefault(
                                PublicEmailTestingDetails.AbSampleSizeDefault.MASTER
                            )
                            .abSamplingDefault(PublicEmailTestingDetails.AbSamplingDefault.MASTER)
                            .abStatus(PublicEmailTestingDetails.AbStatus.MASTER)
                            .abSuccessMetric(
                                PublicEmailTestingDetails.AbSuccessMetric.CLICKS_BY_OPENS
                            )
                            .abTestPercentage(0)
                            .hoursToWait(0)
                            .isAbVariation(true)
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
                            .expiresAt(OffsetDateTime.parse("2020-11-30T18:44:20.387Z"))
                            .isPageRedirected(true)
                            .metaDescription("")
                            .pageExpiryEnabled(true)
                            .redirectToPageId("redirectToPageId")
                            .redirectToUrl("http://www.example.org")
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

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val emailServiceAsync = client.marketing().emails()

        val publicEmailFuture =
            emailServiceAsync.update(
                EmailUpdateParams.builder()
                    .emailId("emailId")
                    .queryArchived(true)
                    .emailUpdateRequest(
                        EmailUpdateRequest.builder()
                            .activeDomain("test.hs-sites.com")
                            .archived(false)
                            .businessUnitId(0L)
                            .campaign("1b7f51a6-33c1-44d6-ba28-fe81f655dced")
                            .content(
                                PublicEmailContent.builder()
                                    .flexAreas(
                                        PublicEmailContent.FlexAreas.builder()
                                            .putAdditionalProperty(
                                                "main",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .plainTextVersion(
                                        "This is custom! View in browser ({{view_as_page_url}})\n\nHello {{ contact.firstname }},\n\nPlain text emails have minimal formatting so your reader can really focus on what you have to say. Introduce yourself and explain why you’re reaching out.\n\nEvery email should try to lead the reader to some kind of action. Use this space to describe why the reader should want to click on the link below. Put the link on its own line to really draw their eye to it.\n\nLink text\n\nNow it’s time to wrap up your email. Before your signature, thank the recipient for reading. You can also invite them to send this email to any of their colleagues who might be interested.\n\nAll the best,\n\nYour full name\n\nYour job title\n\nOther contact information\n\n{{site_settings.company_name}}, {{site_settings.company_street_address_1}}, {{site_settings.company_street_address_2}}, {{site_settings.company_city}}, {{site_settings.company_state}} {{site_settings.company_zip}}, {{site_settings.company_country}}, {{site_settings.company_phone}}\n\nUnsubscribe ({{unsubscribe_link_all}})\n\nManage preferences ({{unsubscribe_link}})"
                                    )
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
                                            .backgroundImageType("backgroundImageType")
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
                                                "module-0-1-1",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .putAdditionalProperty(
                                                "module-1-1-1",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .putAdditionalProperty(
                                                "module_160676180617911",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .putAdditionalProperty(
                                                "preview_text",
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
                                    .fromName("Bruce Wayne")
                                    .replyTo("test@hubspot.com")
                                    .build()
                            )
                            .jitterSendTime(true)
                            .language(EmailUpdateRequest.Language.AF)
                            .name("My subject")
                            .publishDate(OffsetDateTime.parse("2023-11-30T18:44:20.387Z"))
                            .rssData(
                                PublicRssEmailDetails.builder()
                                    .blogEmailType("blogEmailType")
                                    .blogImageMaxWidth(0)
                                    .blogLayout("blogLayout")
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
                            .state(EmailUpdateRequest.State.DRAFT)
                            .subcategory(EmailUpdateRequest.Subcategory.BATCH)
                            .subject("My subject")
                            .subscriptionDetails(
                                PublicEmailSubscriptionDetails.builder()
                                    .officeLocationId("5449392956")
                                    .preferencesGroupId("preferencesGroupId")
                                    .subscriptionId("subscriptionId")
                                    .subscriptionName("subscriptionName")
                                    .build()
                            )
                            .testing(
                                PublicEmailTestingDetails.builder()
                                    .abSampleSizeDefault(
                                        PublicEmailTestingDetails.AbSampleSizeDefault.MASTER
                                    )
                                    .abSamplingDefault(
                                        PublicEmailTestingDetails.AbSamplingDefault.MASTER
                                    )
                                    .abStatus(PublicEmailTestingDetails.AbStatus.MASTER)
                                    .abSuccessMetric(
                                        PublicEmailTestingDetails.AbSuccessMetric.CLICKS_BY_OPENS
                                    )
                                    .abTestPercentage(0)
                                    .hoursToWait(0)
                                    .isAbVariation(true)
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
                                    .expiresAt(OffsetDateTime.parse("2020-11-30T18:44:20.387Z"))
                                    .isPageRedirected(true)
                                    .metaDescription("")
                                    .pageExpiryEnabled(true)
                                    .redirectToPageId("redirectToPageId")
                                    .redirectToUrl("http://www.example.org")
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val emailServiceAsync = client.marketing().emails()

        val pageFuture = emailServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val emailServiceAsync = client.marketing().emails()

        val future =
            emailServiceAsync.delete(
                EmailDeleteParams.builder().emailId("emailId").archived(true).build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun clone() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun createAbTestVariation() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val emailServiceAsync = client.marketing().emails()

        val publicEmailFuture =
            emailServiceAsync.get(
                EmailGetParams.builder()
                    .emailId("emailId")
                    .archived(true)
                    .addIncludedProperty("string")
                    .includeStats(true)
                    .marketingCampaignNames(true)
                    .workflowNames(true)
                    .build()
            )

        val publicEmail = publicEmailFuture.get()
        publicEmail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getAbTestVariation() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val emailServiceAsync = client.marketing().emails()

        val publicEmailFuture = emailServiceAsync.getAbTestVariation("emailId")

        val publicEmail = publicEmailFuture.get()
        publicEmail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getDraft() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val emailServiceAsync = client.marketing().emails()

        val publicEmailFuture = emailServiceAsync.getDraft("emailId")

        val publicEmail = publicEmailFuture.get()
        publicEmail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getRevision() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val emailServiceAsync = client.marketing().emails()

        val versionPublicEmailFuture =
            emailServiceAsync.getRevision(
                EmailGetRevisionParams.builder().emailId("emailId").revisionId("revisionId").build()
            )

        val versionPublicEmail = versionPublicEmailFuture.get()
        versionPublicEmail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listRevisions() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val emailServiceAsync = client.marketing().emails()

        val collectionResponseWithTotalVersionPublicEmailFuture =
            emailServiceAsync.listRevisions(
                EmailListRevisionsParams.builder()
                    .emailId("emailId")
                    .after("after")
                    .before("before")
                    .limit(0)
                    .build()
            )

        val collectionResponseWithTotalVersionPublicEmail =
            collectionResponseWithTotalVersionPublicEmailFuture.get()
        collectionResponseWithTotalVersionPublicEmail.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun publish() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val emailServiceAsync = client.marketing().emails()

        val future = emailServiceAsync.publish("emailId")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun resetDraft() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val emailServiceAsync = client.marketing().emails()

        val future = emailServiceAsync.resetDraft("emailId")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun restoreRevision() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun restoreRevisionToDraft() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun unpublish() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val emailServiceAsync = client.marketing().emails()

        val future = emailServiceAsync.unpublish("emailId")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateDraft() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val emailServiceAsync = client.marketing().emails()

        val publicEmailFuture =
            emailServiceAsync.updateDraft(
                EmailUpdateDraftParams.builder()
                    .emailId("emailId")
                    .emailUpdateRequest(
                        EmailUpdateRequest.builder()
                            .activeDomain("test.hs-sites.com")
                            .archived(false)
                            .businessUnitId(0L)
                            .campaign("1b7f51a6-33c1-44d6-ba28-fe81f655dced")
                            .content(
                                PublicEmailContent.builder()
                                    .flexAreas(
                                        PublicEmailContent.FlexAreas.builder()
                                            .putAdditionalProperty(
                                                "main",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .plainTextVersion(
                                        "This is custom! View in browser ({{view_as_page_url}})\n\nHello {{ contact.firstname }},\n\nPlain text emails have minimal formatting so your reader can really focus on what you have to say. Introduce yourself and explain why you’re reaching out.\n\nEvery email should try to lead the reader to some kind of action. Use this space to describe why the reader should want to click on the link below. Put the link on its own line to really draw their eye to it.\n\nLink text\n\nNow it’s time to wrap up your email. Before your signature, thank the recipient for reading. You can also invite them to send this email to any of their colleagues who might be interested.\n\nAll the best,\n\nYour full name\n\nYour job title\n\nOther contact information\n\n{{site_settings.company_name}}, {{site_settings.company_street_address_1}}, {{site_settings.company_street_address_2}}, {{site_settings.company_city}}, {{site_settings.company_state}} {{site_settings.company_zip}}, {{site_settings.company_country}}, {{site_settings.company_phone}}\n\nUnsubscribe ({{unsubscribe_link_all}})\n\nManage preferences ({{unsubscribe_link}})"
                                    )
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
                                            .backgroundImageType("backgroundImageType")
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
                                                "module-0-1-1",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .putAdditionalProperty(
                                                "module-1-1-1",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .putAdditionalProperty(
                                                "module_160676180617911",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .putAdditionalProperty(
                                                "preview_text",
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
                                    .fromName("Bruce Wayne")
                                    .replyTo("test@hubspot.com")
                                    .build()
                            )
                            .jitterSendTime(true)
                            .language(EmailUpdateRequest.Language.AF)
                            .name("My subject")
                            .publishDate(OffsetDateTime.parse("2023-11-30T18:44:20.387Z"))
                            .rssData(
                                PublicRssEmailDetails.builder()
                                    .blogEmailType("blogEmailType")
                                    .blogImageMaxWidth(0)
                                    .blogLayout("blogLayout")
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
                            .state(EmailUpdateRequest.State.DRAFT)
                            .subcategory(EmailUpdateRequest.Subcategory.BATCH)
                            .subject("My subject")
                            .subscriptionDetails(
                                PublicEmailSubscriptionDetails.builder()
                                    .officeLocationId("5449392956")
                                    .preferencesGroupId("preferencesGroupId")
                                    .subscriptionId("subscriptionId")
                                    .subscriptionName("subscriptionName")
                                    .build()
                            )
                            .testing(
                                PublicEmailTestingDetails.builder()
                                    .abSampleSizeDefault(
                                        PublicEmailTestingDetails.AbSampleSizeDefault.MASTER
                                    )
                                    .abSamplingDefault(
                                        PublicEmailTestingDetails.AbSamplingDefault.MASTER
                                    )
                                    .abStatus(PublicEmailTestingDetails.AbStatus.MASTER)
                                    .abSuccessMetric(
                                        PublicEmailTestingDetails.AbSuccessMetric.CLICKS_BY_OPENS
                                    )
                                    .abTestPercentage(0)
                                    .hoursToWait(0)
                                    .isAbVariation(true)
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
                                    .expiresAt(OffsetDateTime.parse("2020-11-30T18:44:20.387Z"))
                                    .isPageRedirected(true)
                                    .metaDescription("")
                                    .pageExpiryEnabled(true)
                                    .redirectToPageId("redirectToPageId")
                                    .redirectToUrl("http://www.example.org")
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
