// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.VersionUser
import com.hubspot_sdk.api.models.cms.PublicAccessRule
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionPageTest {

    @Test
    fun create() {
        val versionPage =
            VersionPage.builder()
                .id("id")
                .object_(
                    Page.builder()
                        .id("id")
                        .abStatus(Page.AbStatus.MASTER)
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
                                                                                            "a" to
                                                                                                0,
                                                                                            "b" to
                                                                                                0,
                                                                                            "g" to
                                                                                                0,
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
                                                                "verticalAlignment" to
                                                                    "verticalAlignment",
                                                                "breakpointStyles" to
                                                                    mapOf(
                                                                        "foo" to
                                                                            mapOf(
                                                                                "hidden" to true,
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
                                                                    "verticalSide" to "verticalSide",
                                                                ),
                                                        ),
                                                    "backgroundImage" to
                                                        mapOf(
                                                            "backgroundPosition" to
                                                                "backgroundPosition",
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
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .user(VersionUser.builder().id("id").email("email").fullName("fullName").build())
                .build()

        assertThat(versionPage.id()).isEqualTo("id")
        assertThat(versionPage.object_())
            .isEqualTo(
                Page.builder()
                    .id("id")
                    .abStatus(Page.AbStatus.MASTER)
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
                                                            "verticalAlignment" to
                                                                "verticalAlignment",
                                                            "breakpointStyles" to
                                                                mapOf(
                                                                    "foo" to
                                                                        mapOf(
                                                                            "hidden" to true,
                                                                            "margin" to
                                                                                mapOf<
                                                                                    String,
                                                                                    Any,
                                                                                >(),
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
                                                                "horizontalSide" to
                                                                    "horizontalSide",
                                                                "verticalSide" to "verticalSide",
                                                            ),
                                                    ),
                                                "backgroundImage" to
                                                    mapOf(
                                                        "backgroundPosition" to
                                                            "backgroundPosition",
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
        assertThat(versionPage.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(versionPage.user())
            .isEqualTo(VersionUser.builder().id("id").email("email").fullName("fullName").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val versionPage =
            VersionPage.builder()
                .id("id")
                .object_(
                    Page.builder()
                        .id("id")
                        .abStatus(Page.AbStatus.MASTER)
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
                                                                                            "a" to
                                                                                                0,
                                                                                            "b" to
                                                                                                0,
                                                                                            "g" to
                                                                                                0,
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
                                                                "verticalAlignment" to
                                                                    "verticalAlignment",
                                                                "breakpointStyles" to
                                                                    mapOf(
                                                                        "foo" to
                                                                            mapOf(
                                                                                "hidden" to true,
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
                                                                    "verticalSide" to "verticalSide",
                                                                ),
                                                        ),
                                                    "backgroundImage" to
                                                        mapOf(
                                                            "backgroundPosition" to
                                                                "backgroundPosition",
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
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .user(VersionUser.builder().id("id").email("email").fullName("fullName").build())
                .build()

        val roundtrippedVersionPage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(versionPage),
                jacksonTypeRef<VersionPage>(),
            )

        assertThat(roundtrippedVersionPage).isEqualTo(versionPage)
    }
}
