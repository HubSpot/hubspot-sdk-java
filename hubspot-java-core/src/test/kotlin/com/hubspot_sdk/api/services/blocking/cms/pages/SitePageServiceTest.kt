// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.pages

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.AbTestCreateRequestVNext
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.BatchInputJsonNode
import com.hubspot_sdk.api.models.cms.ContentCloneRequestVNext
import com.hubspot_sdk.api.models.cms.ContentScheduleRequestVNext
import com.hubspot_sdk.api.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot_sdk.api.models.cms.PublicAccessRule
import com.hubspot_sdk.api.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.UpdateLanguagesRequestVNext
import com.hubspot_sdk.api.models.cms.pages.AbTestEndRequestVNext
import com.hubspot_sdk.api.models.cms.pages.AbTestRerunRequestVNext
import com.hubspot_sdk.api.models.cms.pages.BatchInputPage
import com.hubspot_sdk.api.models.cms.pages.ContentLanguageCloneRequestVNext
import com.hubspot_sdk.api.models.cms.pages.Page
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageDeleteParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageGetBatchParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageGetParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageGetRevisionParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageRestoreRevisionParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageRestoreRevisionToDraftParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageUpdateBatchParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageUpdateDraftParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SitePageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        sitePageService.create(
            Page.builder()
                .id("id")
                .abStatus(Page.AbStatus.AUTOMATED_LOSER_VARIANT)
                .abTestId("abTestId")
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedInDashboard(true)
                .addAttachedStylesheet(
                    Page.AttachedStylesheet.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .authorName("authorName")
                .campaign("campaign")
                .categoryId(0)
                .contentGroupId("contentGroupId")
                .contentTypeCategory(Page.ContentTypeCategory._0)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdById("createdById")
                .currentlyPublished(true)
                .currentState(Page.CurrentState.AUTOMATED)
                .domain("domain")
                .dynamicPageDataSourceId("dynamicPageDataSourceId")
                .dynamicPageDataSourceType(0)
                .dynamicPageHubDbTableId("dynamicPageHubDbTableId")
                .enableDomainStylesheets(true)
                .enableLayoutStylesheets(true)
                .featuredImage("featuredImage")
                .featuredImageAltText("featuredImageAltText")
                .folderId("folderId")
                .footerHtml("footerHtml")
                .headHtml("headHtml")
                .htmlTitle("htmlTitle")
                .includeDefaultCustomCss(true)
                .language(Page.Language.AF)
                .layoutSections(
                    Page.LayoutSections.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "cells" to listOf(),
                                    "cssClass" to "cssClass",
                                    "cssId" to "cssId",
                                    "cssStyle" to "cssStyle",
                                    "label" to "label",
                                    "name" to "name",
                                    "params" to mapOf("foo" to mapOf<String, Any>()),
                                    "rowMetaData" to
                                        listOf(
                                            mapOf(
                                                "cssClass" to "cssClass",
                                                "styles" to
                                                    mapOf(
                                                        "backgroundColor" to
                                                            mapOf(
                                                                "a" to 0,
                                                                "b" to 0,
                                                                "g" to 0,
                                                                "r" to 0,
                                                            ),
                                                        "backgroundGradient" to
                                                            mapOf(
                                                                "angle" to
                                                                    mapOf(
                                                                        "units" to "units",
                                                                        "value" to 0,
                                                                    ),
                                                                "colors" to
                                                                    listOf(
                                                                        mapOf(
                                                                            "color" to
                                                                                mapOf(
                                                                                    "a" to 0,
                                                                                    "b" to 0,
                                                                                    "g" to 0,
                                                                                    "r" to 0,
                                                                                )
                                                                        )
                                                                    ),
                                                                "sideOrCorner" to
                                                                    mapOf(
                                                                        "horizontalSide" to
                                                                            "horizontalSide",
                                                                        "verticalSide" to
                                                                            "verticalSide",
                                                                    ),
                                                            ),
                                                        "backgroundImage" to
                                                            mapOf(
                                                                "backgroundPosition" to
                                                                    "backgroundPosition",
                                                                "backgroundSize" to
                                                                    "backgroundSize",
                                                                "imageUrl" to "imageUrl",
                                                            ),
                                                        "flexboxPositioning" to
                                                            "flexboxPositioning",
                                                        "forceFullWidthSection" to true,
                                                        "maxWidthSectionCentering" to 0,
                                                        "verticalAlignment" to "verticalAlignment",
                                                        "breakpointStyles" to
                                                            mapOf(
                                                                "foo" to
                                                                    mapOf(
                                                                        "hidden" to true,
                                                                        "margin" to
                                                                            mapOf<String, Any>(),
                                                                        "padding" to
                                                                            mapOf<String, Any>(),
                                                                    )
                                                            ),
                                                    ),
                                            )
                                        ),
                                    "rows" to listOf(mapOf<String, Any>()),
                                    "styles" to
                                        mapOf(
                                            "backgroundColor" to
                                                mapOf("a" to 0, "b" to 0, "g" to 0, "r" to 0),
                                            "backgroundGradient" to
                                                mapOf(
                                                    "angle" to
                                                        mapOf("units" to "units", "value" to 0),
                                                    "colors" to
                                                        listOf(
                                                            mapOf(
                                                                "color" to
                                                                    mapOf(
                                                                        "a" to 0,
                                                                        "b" to 0,
                                                                        "g" to 0,
                                                                        "r" to 0,
                                                                    )
                                                            )
                                                        ),
                                                    "sideOrCorner" to
                                                        mapOf(
                                                            "horizontalSide" to "horizontalSide",
                                                            "verticalSide" to "verticalSide",
                                                        ),
                                                ),
                                            "backgroundImage" to
                                                mapOf(
                                                    "backgroundPosition" to "backgroundPosition",
                                                    "backgroundSize" to "backgroundSize",
                                                    "imageUrl" to "imageUrl",
                                                ),
                                            "flexboxPositioning" to "flexboxPositioning",
                                            "forceFullWidthSection" to true,
                                            "maxWidthSectionCentering" to 0,
                                            "verticalAlignment" to "verticalAlignment",
                                            "breakpointStyles" to
                                                mapOf(
                                                    "foo" to
                                                        mapOf(
                                                            "hidden" to true,
                                                            "margin" to mapOf<String, Any>(),
                                                            "padding" to mapOf<String, Any>(),
                                                        )
                                                ),
                                        ),
                                    "type" to "type",
                                    "w" to 0,
                                    "x" to 0,
                                )
                            ),
                        )
                        .build()
                )
                .linkRelCanonicalUrl("linkRelCanonicalUrl")
                .mabExperimentId("mabExperimentId")
                .metaDescription("metaDescription")
                .name("name")
                .pageExpiryDate(0L)
                .pageExpiryEnabled(true)
                .pageExpiryRedirectId(0L)
                .pageExpiryRedirectUrl("pageExpiryRedirectUrl")
                .pageRedirected(true)
                .password("password")
                .addPublicAccessRule(PublicAccessRule.builder().build())
                .publicAccessRulesEnabled(true)
                .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .publishImmediately(true)
                .slug("slug")
                .state("state")
                .subcategory("subcategory")
                .templatePath("templatePath")
                .themeSettingsValues(
                    Page.ThemeSettingsValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .translatedFromId("translatedFromId")
                .translations(
                    Page.Translations.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "id" to 0,
                                    "archivedInDashboard" to true,
                                    "authorName" to "authorName",
                                    "campaign" to "campaign",
                                    "created" to "2019-12-27T18:11:19.117Z",
                                    "name" to "name",
                                    "password" to "password",
                                    "publicAccessRules" to listOf(mapOf<String, Any>()),
                                    "publicAccessRulesEnabled" to true,
                                    "publishDate" to "2019-12-27T18:11:19.117Z",
                                    "slug" to "slug",
                                    "state" to "state",
                                    "updated" to "2019-12-27T18:11:19.117Z",
                                    "tagIds" to listOf(0),
                                )
                            ),
                        )
                        .build()
                )
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedById("updatedById")
                .url("url")
                .useFeaturedImage(true)
                .widgetContainers(
                    Page.WidgetContainers.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .widgets(
                    Page.Widgets.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        val page =
            sitePageService.update(
                SitePageUpdateParams.builder()
                    .objectId("objectId")
                    .archived(true)
                    .page(
                        Page.builder()
                            .id("id")
                            .abStatus(Page.AbStatus.AUTOMATED_LOSER_VARIANT)
                            .abTestId("abTestId")
                            .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .archivedInDashboard(true)
                            .addAttachedStylesheet(
                                Page.AttachedStylesheet.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .authorName("authorName")
                            .campaign("campaign")
                            .categoryId(0)
                            .contentGroupId("contentGroupId")
                            .contentTypeCategory(Page.ContentTypeCategory._0)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .createdById("createdById")
                            .currentlyPublished(true)
                            .currentState(Page.CurrentState.AUTOMATED)
                            .domain("domain")
                            .dynamicPageDataSourceId("dynamicPageDataSourceId")
                            .dynamicPageDataSourceType(0)
                            .dynamicPageHubDbTableId("dynamicPageHubDbTableId")
                            .enableDomainStylesheets(true)
                            .enableLayoutStylesheets(true)
                            .featuredImage("featuredImage")
                            .featuredImageAltText("featuredImageAltText")
                            .folderId("folderId")
                            .footerHtml("footerHtml")
                            .headHtml("headHtml")
                            .htmlTitle("htmlTitle")
                            .includeDefaultCustomCss(true)
                            .language(Page.Language.AF)
                            .layoutSections(
                                Page.LayoutSections.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            mapOf(
                                                "cells" to listOf(),
                                                "cssClass" to "cssClass",
                                                "cssId" to "cssId",
                                                "cssStyle" to "cssStyle",
                                                "label" to "label",
                                                "name" to "name",
                                                "params" to mapOf("foo" to mapOf<String, Any>()),
                                                "rowMetaData" to
                                                    listOf(
                                                        mapOf(
                                                            "cssClass" to "cssClass",
                                                            "styles" to
                                                                mapOf(
                                                                    "backgroundColor" to
                                                                        mapOf(
                                                                            "a" to 0,
                                                                            "b" to 0,
                                                                            "g" to 0,
                                                                            "r" to 0,
                                                                        ),
                                                                    "backgroundGradient" to
                                                                        mapOf(
                                                                            "angle" to
                                                                                mapOf(
                                                                                    "units" to
                                                                                        "units",
                                                                                    "value" to 0,
                                                                                ),
                                                                            "colors" to
                                                                                listOf(
                                                                                    mapOf(
                                                                                        "color" to
                                                                                            mapOf(
                                                                                                "a" to
                                                                                                    0,
                                                                                                "b" to
                                                                                                    0,
                                                                                                "g" to
                                                                                                    0,
                                                                                                "r" to
                                                                                                    0,
                                                                                            )
                                                                                    )
                                                                                ),
                                                                            "sideOrCorner" to
                                                                                mapOf(
                                                                                    "horizontalSide" to
                                                                                        "horizontalSide",
                                                                                    "verticalSide" to
                                                                                        "verticalSide",
                                                                                ),
                                                                        ),
                                                                    "backgroundImage" to
                                                                        mapOf(
                                                                            "backgroundPosition" to
                                                                                "backgroundPosition",
                                                                            "backgroundSize" to
                                                                                "backgroundSize",
                                                                            "imageUrl" to "imageUrl",
                                                                        ),
                                                                    "flexboxPositioning" to
                                                                        "flexboxPositioning",
                                                                    "forceFullWidthSection" to true,
                                                                    "maxWidthSectionCentering" to 0,
                                                                    "verticalAlignment" to
                                                                        "verticalAlignment",
                                                                    "breakpointStyles" to
                                                                        mapOf(
                                                                            "foo" to
                                                                                mapOf(
                                                                                    "hidden" to
                                                                                        true,
                                                                                    "margin" to
                                                                                        mapOf<
                                                                                            String,
                                                                                            Any,
                                                                                        >(),
                                                                                    "padding" to
                                                                                        mapOf<
                                                                                            String,
                                                                                            Any,
                                                                                        >(),
                                                                                )
                                                                        ),
                                                                ),
                                                        )
                                                    ),
                                                "rows" to listOf(mapOf<String, Any>()),
                                                "styles" to
                                                    mapOf(
                                                        "backgroundColor" to
                                                            mapOf(
                                                                "a" to 0,
                                                                "b" to 0,
                                                                "g" to 0,
                                                                "r" to 0,
                                                            ),
                                                        "backgroundGradient" to
                                                            mapOf(
                                                                "angle" to
                                                                    mapOf(
                                                                        "units" to "units",
                                                                        "value" to 0,
                                                                    ),
                                                                "colors" to
                                                                    listOf(
                                                                        mapOf(
                                                                            "color" to
                                                                                mapOf(
                                                                                    "a" to 0,
                                                                                    "b" to 0,
                                                                                    "g" to 0,
                                                                                    "r" to 0,
                                                                                )
                                                                        )
                                                                    ),
                                                                "sideOrCorner" to
                                                                    mapOf(
                                                                        "horizontalSide" to
                                                                            "horizontalSide",
                                                                        "verticalSide" to
                                                                            "verticalSide",
                                                                    ),
                                                            ),
                                                        "backgroundImage" to
                                                            mapOf(
                                                                "backgroundPosition" to
                                                                    "backgroundPosition",
                                                                "backgroundSize" to
                                                                    "backgroundSize",
                                                                "imageUrl" to "imageUrl",
                                                            ),
                                                        "flexboxPositioning" to
                                                            "flexboxPositioning",
                                                        "forceFullWidthSection" to true,
                                                        "maxWidthSectionCentering" to 0,
                                                        "verticalAlignment" to "verticalAlignment",
                                                        "breakpointStyles" to
                                                            mapOf(
                                                                "foo" to
                                                                    mapOf(
                                                                        "hidden" to true,
                                                                        "margin" to
                                                                            mapOf<String, Any>(),
                                                                        "padding" to
                                                                            mapOf<String, Any>(),
                                                                    )
                                                            ),
                                                    ),
                                                "type" to "type",
                                                "w" to 0,
                                                "x" to 0,
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .linkRelCanonicalUrl("linkRelCanonicalUrl")
                            .mabExperimentId("mabExperimentId")
                            .metaDescription("metaDescription")
                            .name("name")
                            .pageExpiryDate(0L)
                            .pageExpiryEnabled(true)
                            .pageExpiryRedirectId(0L)
                            .pageExpiryRedirectUrl("pageExpiryRedirectUrl")
                            .pageRedirected(true)
                            .password("password")
                            .addPublicAccessRule(PublicAccessRule.builder().build())
                            .publicAccessRulesEnabled(true)
                            .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .publishImmediately(true)
                            .slug("slug")
                            .state("state")
                            .subcategory("subcategory")
                            .templatePath("templatePath")
                            .themeSettingsValues(
                                Page.ThemeSettingsValues.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .translatedFromId("translatedFromId")
                            .translations(
                                Page.Translations.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            mapOf(
                                                "id" to 0,
                                                "archivedInDashboard" to true,
                                                "authorName" to "authorName",
                                                "campaign" to "campaign",
                                                "created" to "2019-12-27T18:11:19.117Z",
                                                "name" to "name",
                                                "password" to "password",
                                                "publicAccessRules" to listOf(mapOf<String, Any>()),
                                                "publicAccessRulesEnabled" to true,
                                                "publishDate" to "2019-12-27T18:11:19.117Z",
                                                "slug" to "slug",
                                                "state" to "state",
                                                "updated" to "2019-12-27T18:11:19.117Z",
                                                "tagIds" to listOf(0),
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .updatedById("updatedById")
                            .url("url")
                            .useFeaturedImage(true)
                            .widgetContainers(
                                Page.WidgetContainers.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .widgets(
                                Page.Widgets.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        page.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        val page = sitePageService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        sitePageService.delete(
            SitePageDeleteParams.builder().objectId("objectId").archived(true).build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun attachToLangGroup() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        sitePageService.attachToLangGroup(
            AttachToLangPrimaryRequestVNext.builder()
                .id("id")
                .language("language")
                .primaryId("primaryId")
                .primaryLanguage("primaryLanguage")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun clone() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        val page =
            sitePageService.clone(
                ContentCloneRequestVNext.builder().id("id").cloneName("cloneName").build()
            )

        page.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createAbTestVariation() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        val page =
            sitePageService.createAbTestVariation(
                AbTestCreateRequestVNext.builder()
                    .contentId("contentId")
                    .variationName("variationName")
                    .build()
            )

        page.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        val batchResponsePage =
            sitePageService.createBatch(
                BatchInputPage.builder()
                    .addInput(
                        Page.builder()
                            .id("id")
                            .abStatus(Page.AbStatus.AUTOMATED_LOSER_VARIANT)
                            .abTestId("abTestId")
                            .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .archivedInDashboard(true)
                            .addAttachedStylesheet(
                                Page.AttachedStylesheet.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .authorName("authorName")
                            .campaign("campaign")
                            .categoryId(0)
                            .contentGroupId("contentGroupId")
                            .contentTypeCategory(Page.ContentTypeCategory._0)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .createdById("createdById")
                            .currentlyPublished(true)
                            .currentState(Page.CurrentState.AUTOMATED)
                            .domain("domain")
                            .dynamicPageDataSourceId("dynamicPageDataSourceId")
                            .dynamicPageDataSourceType(0)
                            .dynamicPageHubDbTableId("dynamicPageHubDbTableId")
                            .enableDomainStylesheets(true)
                            .enableLayoutStylesheets(true)
                            .featuredImage("featuredImage")
                            .featuredImageAltText("featuredImageAltText")
                            .folderId("folderId")
                            .footerHtml("footerHtml")
                            .headHtml("headHtml")
                            .htmlTitle("htmlTitle")
                            .includeDefaultCustomCss(true)
                            .language(Page.Language.AF)
                            .layoutSections(
                                Page.LayoutSections.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            mapOf(
                                                "cells" to listOf(),
                                                "cssClass" to "cssClass",
                                                "cssId" to "cssId",
                                                "cssStyle" to "cssStyle",
                                                "label" to "label",
                                                "name" to "name",
                                                "params" to mapOf("foo" to mapOf<String, Any>()),
                                                "rowMetaData" to
                                                    listOf(
                                                        mapOf(
                                                            "cssClass" to "cssClass",
                                                            "styles" to
                                                                mapOf(
                                                                    "backgroundColor" to
                                                                        mapOf(
                                                                            "a" to 0,
                                                                            "b" to 0,
                                                                            "g" to 0,
                                                                            "r" to 0,
                                                                        ),
                                                                    "backgroundGradient" to
                                                                        mapOf(
                                                                            "angle" to
                                                                                mapOf(
                                                                                    "units" to
                                                                                        "units",
                                                                                    "value" to 0,
                                                                                ),
                                                                            "colors" to
                                                                                listOf(
                                                                                    mapOf(
                                                                                        "color" to
                                                                                            mapOf(
                                                                                                "a" to
                                                                                                    0,
                                                                                                "b" to
                                                                                                    0,
                                                                                                "g" to
                                                                                                    0,
                                                                                                "r" to
                                                                                                    0,
                                                                                            )
                                                                                    )
                                                                                ),
                                                                            "sideOrCorner" to
                                                                                mapOf(
                                                                                    "horizontalSide" to
                                                                                        "horizontalSide",
                                                                                    "verticalSide" to
                                                                                        "verticalSide",
                                                                                ),
                                                                        ),
                                                                    "backgroundImage" to
                                                                        mapOf(
                                                                            "backgroundPosition" to
                                                                                "backgroundPosition",
                                                                            "backgroundSize" to
                                                                                "backgroundSize",
                                                                            "imageUrl" to "imageUrl",
                                                                        ),
                                                                    "flexboxPositioning" to
                                                                        "flexboxPositioning",
                                                                    "forceFullWidthSection" to true,
                                                                    "maxWidthSectionCentering" to 0,
                                                                    "verticalAlignment" to
                                                                        "verticalAlignment",
                                                                    "breakpointStyles" to
                                                                        mapOf(
                                                                            "foo" to
                                                                                mapOf(
                                                                                    "hidden" to
                                                                                        true,
                                                                                    "margin" to
                                                                                        mapOf<
                                                                                            String,
                                                                                            Any,
                                                                                        >(),
                                                                                    "padding" to
                                                                                        mapOf<
                                                                                            String,
                                                                                            Any,
                                                                                        >(),
                                                                                )
                                                                        ),
                                                                ),
                                                        )
                                                    ),
                                                "rows" to listOf(mapOf<String, Any>()),
                                                "styles" to
                                                    mapOf(
                                                        "backgroundColor" to
                                                            mapOf(
                                                                "a" to 0,
                                                                "b" to 0,
                                                                "g" to 0,
                                                                "r" to 0,
                                                            ),
                                                        "backgroundGradient" to
                                                            mapOf(
                                                                "angle" to
                                                                    mapOf(
                                                                        "units" to "units",
                                                                        "value" to 0,
                                                                    ),
                                                                "colors" to
                                                                    listOf(
                                                                        mapOf(
                                                                            "color" to
                                                                                mapOf(
                                                                                    "a" to 0,
                                                                                    "b" to 0,
                                                                                    "g" to 0,
                                                                                    "r" to 0,
                                                                                )
                                                                        )
                                                                    ),
                                                                "sideOrCorner" to
                                                                    mapOf(
                                                                        "horizontalSide" to
                                                                            "horizontalSide",
                                                                        "verticalSide" to
                                                                            "verticalSide",
                                                                    ),
                                                            ),
                                                        "backgroundImage" to
                                                            mapOf(
                                                                "backgroundPosition" to
                                                                    "backgroundPosition",
                                                                "backgroundSize" to
                                                                    "backgroundSize",
                                                                "imageUrl" to "imageUrl",
                                                            ),
                                                        "flexboxPositioning" to
                                                            "flexboxPositioning",
                                                        "forceFullWidthSection" to true,
                                                        "maxWidthSectionCentering" to 0,
                                                        "verticalAlignment" to "verticalAlignment",
                                                        "breakpointStyles" to
                                                            mapOf(
                                                                "foo" to
                                                                    mapOf(
                                                                        "hidden" to true,
                                                                        "margin" to
                                                                            mapOf<String, Any>(),
                                                                        "padding" to
                                                                            mapOf<String, Any>(),
                                                                    )
                                                            ),
                                                    ),
                                                "type" to "type",
                                                "w" to 0,
                                                "x" to 0,
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .linkRelCanonicalUrl("linkRelCanonicalUrl")
                            .mabExperimentId("mabExperimentId")
                            .metaDescription("metaDescription")
                            .name("name")
                            .pageExpiryDate(0L)
                            .pageExpiryEnabled(true)
                            .pageExpiryRedirectId(0L)
                            .pageExpiryRedirectUrl("pageExpiryRedirectUrl")
                            .pageRedirected(true)
                            .password("password")
                            .addPublicAccessRule(PublicAccessRule.builder().build())
                            .publicAccessRulesEnabled(true)
                            .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .publishImmediately(true)
                            .slug("slug")
                            .state("state")
                            .subcategory("subcategory")
                            .templatePath("templatePath")
                            .themeSettingsValues(
                                Page.ThemeSettingsValues.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .translatedFromId("translatedFromId")
                            .translations(
                                Page.Translations.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            mapOf(
                                                "id" to 0,
                                                "archivedInDashboard" to true,
                                                "authorName" to "authorName",
                                                "campaign" to "campaign",
                                                "created" to "2019-12-27T18:11:19.117Z",
                                                "name" to "name",
                                                "password" to "password",
                                                "publicAccessRules" to listOf(mapOf<String, Any>()),
                                                "publicAccessRulesEnabled" to true,
                                                "publishDate" to "2019-12-27T18:11:19.117Z",
                                                "slug" to "slug",
                                                "state" to "state",
                                                "updated" to "2019-12-27T18:11:19.117Z",
                                                "tagIds" to listOf(0),
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .updatedById("updatedById")
                            .url("url")
                            .useFeaturedImage(true)
                            .widgetContainers(
                                Page.WidgetContainers.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .widgets(
                                Page.Widgets.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponsePage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createLanguageVariation() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        val page =
            sitePageService.createLanguageVariation(
                ContentLanguageCloneRequestVNext.builder()
                    .id("id")
                    .language("language")
                    .primaryLanguage("primaryLanguage")
                    .build()
            )

        page.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        sitePageService.deleteBatch(BatchInputString.builder().addInput("string").build())
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun detachFromLangGroup() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        sitePageService.detachFromLangGroup(
            DetachFromLangGroupRequestVNext.builder().id("id").build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun endAbTest() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        sitePageService.endAbTest(
            AbTestEndRequestVNext.builder().abTestId("abTestId").winnerId("winnerId").build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        val page =
            sitePageService.get(
                SitePageGetParams.builder()
                    .objectId("objectId")
                    .archived(true)
                    .property("property")
                    .build()
            )

        page.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        val batchResponsePage =
            sitePageService.getBatch(
                SitePageGetBatchParams.builder()
                    .archived(true)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponsePage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getDraft() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        val page = sitePageService.getDraft("objectId")

        page.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getRevision() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        val versionPage =
            sitePageService.getRevision(
                SitePageGetRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        versionPage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listRevisions() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        val page = sitePageService.listRevisions("objectId")

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun publishDraft() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        sitePageService.publishDraft("objectId")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun rerunAbTest() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        sitePageService.rerunAbTest(
            AbTestRerunRequestVNext.builder()
                .abTestId("abTestId")
                .variationId("variationId")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun resetDraft() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        sitePageService.resetDraft("objectId")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun restoreRevision() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        val page =
            sitePageService.restoreRevision(
                SitePageRestoreRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        page.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun restoreRevisionToDraft() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        val page =
            sitePageService.restoreRevisionToDraft(
                SitePageRestoreRevisionToDraftParams.builder()
                    .objectId("objectId")
                    .revisionId(0L)
                    .build()
            )

        page.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun schedule() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        sitePageService.schedule(
            ContentScheduleRequestVNext.builder()
                .id("id")
                .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setNewLangPrimary() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        sitePageService.setNewLangPrimary(
            SetNewLanguagePrimaryRequestVNext.builder().id("id").build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        val batchResponsePage =
            sitePageService.updateBatch(
                SitePageUpdateBatchParams.builder()
                    .archived(true)
                    .batchInputJsonNode(
                        BatchInputJsonNode.builder()
                            .addInput(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        batchResponsePage.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateDraft() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        val page =
            sitePageService.updateDraft(
                SitePageUpdateDraftParams.builder()
                    .objectId("objectId")
                    .page(
                        Page.builder()
                            .id("id")
                            .abStatus(Page.AbStatus.AUTOMATED_LOSER_VARIANT)
                            .abTestId("abTestId")
                            .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .archivedInDashboard(true)
                            .addAttachedStylesheet(
                                Page.AttachedStylesheet.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .authorName("authorName")
                            .campaign("campaign")
                            .categoryId(0)
                            .contentGroupId("contentGroupId")
                            .contentTypeCategory(Page.ContentTypeCategory._0)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .createdById("createdById")
                            .currentlyPublished(true)
                            .currentState(Page.CurrentState.AUTOMATED)
                            .domain("domain")
                            .dynamicPageDataSourceId("dynamicPageDataSourceId")
                            .dynamicPageDataSourceType(0)
                            .dynamicPageHubDbTableId("dynamicPageHubDbTableId")
                            .enableDomainStylesheets(true)
                            .enableLayoutStylesheets(true)
                            .featuredImage("featuredImage")
                            .featuredImageAltText("featuredImageAltText")
                            .folderId("folderId")
                            .footerHtml("footerHtml")
                            .headHtml("headHtml")
                            .htmlTitle("htmlTitle")
                            .includeDefaultCustomCss(true)
                            .language(Page.Language.AF)
                            .layoutSections(
                                Page.LayoutSections.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            mapOf(
                                                "cells" to listOf(),
                                                "cssClass" to "cssClass",
                                                "cssId" to "cssId",
                                                "cssStyle" to "cssStyle",
                                                "label" to "label",
                                                "name" to "name",
                                                "params" to mapOf("foo" to mapOf<String, Any>()),
                                                "rowMetaData" to
                                                    listOf(
                                                        mapOf(
                                                            "cssClass" to "cssClass",
                                                            "styles" to
                                                                mapOf(
                                                                    "backgroundColor" to
                                                                        mapOf(
                                                                            "a" to 0,
                                                                            "b" to 0,
                                                                            "g" to 0,
                                                                            "r" to 0,
                                                                        ),
                                                                    "backgroundGradient" to
                                                                        mapOf(
                                                                            "angle" to
                                                                                mapOf(
                                                                                    "units" to
                                                                                        "units",
                                                                                    "value" to 0,
                                                                                ),
                                                                            "colors" to
                                                                                listOf(
                                                                                    mapOf(
                                                                                        "color" to
                                                                                            mapOf(
                                                                                                "a" to
                                                                                                    0,
                                                                                                "b" to
                                                                                                    0,
                                                                                                "g" to
                                                                                                    0,
                                                                                                "r" to
                                                                                                    0,
                                                                                            )
                                                                                    )
                                                                                ),
                                                                            "sideOrCorner" to
                                                                                mapOf(
                                                                                    "horizontalSide" to
                                                                                        "horizontalSide",
                                                                                    "verticalSide" to
                                                                                        "verticalSide",
                                                                                ),
                                                                        ),
                                                                    "backgroundImage" to
                                                                        mapOf(
                                                                            "backgroundPosition" to
                                                                                "backgroundPosition",
                                                                            "backgroundSize" to
                                                                                "backgroundSize",
                                                                            "imageUrl" to "imageUrl",
                                                                        ),
                                                                    "flexboxPositioning" to
                                                                        "flexboxPositioning",
                                                                    "forceFullWidthSection" to true,
                                                                    "maxWidthSectionCentering" to 0,
                                                                    "verticalAlignment" to
                                                                        "verticalAlignment",
                                                                    "breakpointStyles" to
                                                                        mapOf(
                                                                            "foo" to
                                                                                mapOf(
                                                                                    "hidden" to
                                                                                        true,
                                                                                    "margin" to
                                                                                        mapOf<
                                                                                            String,
                                                                                            Any,
                                                                                        >(),
                                                                                    "padding" to
                                                                                        mapOf<
                                                                                            String,
                                                                                            Any,
                                                                                        >(),
                                                                                )
                                                                        ),
                                                                ),
                                                        )
                                                    ),
                                                "rows" to listOf(mapOf<String, Any>()),
                                                "styles" to
                                                    mapOf(
                                                        "backgroundColor" to
                                                            mapOf(
                                                                "a" to 0,
                                                                "b" to 0,
                                                                "g" to 0,
                                                                "r" to 0,
                                                            ),
                                                        "backgroundGradient" to
                                                            mapOf(
                                                                "angle" to
                                                                    mapOf(
                                                                        "units" to "units",
                                                                        "value" to 0,
                                                                    ),
                                                                "colors" to
                                                                    listOf(
                                                                        mapOf(
                                                                            "color" to
                                                                                mapOf(
                                                                                    "a" to 0,
                                                                                    "b" to 0,
                                                                                    "g" to 0,
                                                                                    "r" to 0,
                                                                                )
                                                                        )
                                                                    ),
                                                                "sideOrCorner" to
                                                                    mapOf(
                                                                        "horizontalSide" to
                                                                            "horizontalSide",
                                                                        "verticalSide" to
                                                                            "verticalSide",
                                                                    ),
                                                            ),
                                                        "backgroundImage" to
                                                            mapOf(
                                                                "backgroundPosition" to
                                                                    "backgroundPosition",
                                                                "backgroundSize" to
                                                                    "backgroundSize",
                                                                "imageUrl" to "imageUrl",
                                                            ),
                                                        "flexboxPositioning" to
                                                            "flexboxPositioning",
                                                        "forceFullWidthSection" to true,
                                                        "maxWidthSectionCentering" to 0,
                                                        "verticalAlignment" to "verticalAlignment",
                                                        "breakpointStyles" to
                                                            mapOf(
                                                                "foo" to
                                                                    mapOf(
                                                                        "hidden" to true,
                                                                        "margin" to
                                                                            mapOf<String, Any>(),
                                                                        "padding" to
                                                                            mapOf<String, Any>(),
                                                                    )
                                                            ),
                                                    ),
                                                "type" to "type",
                                                "w" to 0,
                                                "x" to 0,
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .linkRelCanonicalUrl("linkRelCanonicalUrl")
                            .mabExperimentId("mabExperimentId")
                            .metaDescription("metaDescription")
                            .name("name")
                            .pageExpiryDate(0L)
                            .pageExpiryEnabled(true)
                            .pageExpiryRedirectId(0L)
                            .pageExpiryRedirectUrl("pageExpiryRedirectUrl")
                            .pageRedirected(true)
                            .password("password")
                            .addPublicAccessRule(PublicAccessRule.builder().build())
                            .publicAccessRulesEnabled(true)
                            .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .publishImmediately(true)
                            .slug("slug")
                            .state("state")
                            .subcategory("subcategory")
                            .templatePath("templatePath")
                            .themeSettingsValues(
                                Page.ThemeSettingsValues.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .translatedFromId("translatedFromId")
                            .translations(
                                Page.Translations.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            mapOf(
                                                "id" to 0,
                                                "archivedInDashboard" to true,
                                                "authorName" to "authorName",
                                                "campaign" to "campaign",
                                                "created" to "2019-12-27T18:11:19.117Z",
                                                "name" to "name",
                                                "password" to "password",
                                                "publicAccessRules" to listOf(mapOf<String, Any>()),
                                                "publicAccessRulesEnabled" to true,
                                                "publishDate" to "2019-12-27T18:11:19.117Z",
                                                "slug" to "slug",
                                                "state" to "state",
                                                "updated" to "2019-12-27T18:11:19.117Z",
                                                "tagIds" to listOf(0),
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .updatedById("updatedById")
                            .url("url")
                            .useFeaturedImage(true)
                            .widgetContainers(
                                Page.WidgetContainers.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .widgets(
                                Page.Widgets.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        page.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateLanguages() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sitePageService = client.cms().pages().sitePages()

        sitePageService.updateLanguages(
            UpdateLanguagesRequestVNext.builder()
                .languages(
                    UpdateLanguagesRequestVNext.Languages.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .primaryId("primaryId")
                .build()
        )
    }
}
