// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.posts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.VersionUser
import com.hubspot_sdk.api.models.cms.PublicAccessRule
import com.hubspot_sdk.api.models.marketing.emails.Paging
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalVersionBlogPostTest {

    @Test
    fun create() {
        val collectionResponseWithTotalVersionBlogPost =
            CollectionResponseWithTotalVersionBlogPost.builder()
                .addResult(
                    VersionBlogPost.builder()
                        .id("id")
                        .object_(
                            BlogPost.builder()
                                .id("id")
                                .abStatus(BlogPost.AbStatus.MASTER)
                                .abTestId("abTestId")
                                .archivedAt(0L)
                                .archivedInDashboard(true)
                                .addAttachedStylesheet(
                                    BlogPost.AttachedStylesheet.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
                                .authorName("authorName")
                                .blogAuthorId("blogAuthorId")
                                .campaign("campaign")
                                .categoryId(0)
                                .contentGroupId("contentGroupId")
                                .contentTypeCategory(BlogPost.ContentTypeCategory._0)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .createdById("createdById")
                                .currentlyPublished(true)
                                .currentState(BlogPost.CurrentState.AUTOMATED)
                                .domain("domain")
                                .dynamicPageDataSourceId("dynamicPageDataSourceId")
                                .dynamicPageDataSourceType(0)
                                .dynamicPageHubDbTableId("dynamicPageHubDbTableId")
                                .enableDomainStylesheets(true)
                                .enableGoogleAmpOutputOverride(true)
                                .enableLayoutStylesheets(true)
                                .featuredImage("featuredImage")
                                .featuredImageAltText("featuredImageAltText")
                                .folderId("folderId")
                                .footerHtml("footerHtml")
                                .headHtml("headHtml")
                                .htmlTitle("htmlTitle")
                                .includeDefaultCustomCss(true)
                                .language(BlogPost.Language.AF)
                                .layoutSections(
                                    BlogPost.LayoutSections.builder()
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
                                                    "params" to
                                                        mapOf("foo" to mapOf<String, Any>()),
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
                                                                                "imageUrl" to
                                                                                    "imageUrl",
                                                                            ),
                                                                        "flexboxPositioning" to
                                                                            "flexboxPositioning",
                                                                        "forceFullWidthSection" to
                                                                            true,
                                                                        "maxWidthSectionCentering" to
                                                                            0,
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
                                .password("password")
                                .postBody("postBody")
                                .postSummary("postSummary")
                                .addPublicAccessRule(PublicAccessRule.builder().build())
                                .publicAccessRulesEnabled(true)
                                .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .publishImmediately(true)
                                .rssBody("rssBody")
                                .rssSummary("rssSummary")
                                .slug("slug")
                                .state("state")
                                .addTagId(0L)
                                .themeSettingsValues(
                                    BlogPost.ThemeSettingsValues.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
                                .translatedFromId("translatedFromId")
                                .translations(
                                    BlogPost.Translations.builder()
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
                                                    "publicAccessRules" to
                                                        listOf(mapOf<String, Any>()),
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
                                    BlogPost.WidgetContainers.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
                                .widgets(
                                    BlogPost.Widgets.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .user(
                            VersionUser.builder()
                                .id("id")
                                .email("email")
                                .fullName("fullName")
                                .build()
                        )
                        .build()
                )
                .total(0)
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalVersionBlogPost.results())
            .containsExactly(
                VersionBlogPost.builder()
                    .id("id")
                    .object_(
                        BlogPost.builder()
                            .id("id")
                            .abStatus(BlogPost.AbStatus.MASTER)
                            .abTestId("abTestId")
                            .archivedAt(0L)
                            .archivedInDashboard(true)
                            .addAttachedStylesheet(
                                BlogPost.AttachedStylesheet.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .authorName("authorName")
                            .blogAuthorId("blogAuthorId")
                            .campaign("campaign")
                            .categoryId(0)
                            .contentGroupId("contentGroupId")
                            .contentTypeCategory(BlogPost.ContentTypeCategory._0)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .createdById("createdById")
                            .currentlyPublished(true)
                            .currentState(BlogPost.CurrentState.AUTOMATED)
                            .domain("domain")
                            .dynamicPageDataSourceId("dynamicPageDataSourceId")
                            .dynamicPageDataSourceType(0)
                            .dynamicPageHubDbTableId("dynamicPageHubDbTableId")
                            .enableDomainStylesheets(true)
                            .enableGoogleAmpOutputOverride(true)
                            .enableLayoutStylesheets(true)
                            .featuredImage("featuredImage")
                            .featuredImageAltText("featuredImageAltText")
                            .folderId("folderId")
                            .footerHtml("footerHtml")
                            .headHtml("headHtml")
                            .htmlTitle("htmlTitle")
                            .includeDefaultCustomCss(true)
                            .language(BlogPost.Language.AF)
                            .layoutSections(
                                BlogPost.LayoutSections.builder()
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
                            .password("password")
                            .postBody("postBody")
                            .postSummary("postSummary")
                            .addPublicAccessRule(PublicAccessRule.builder().build())
                            .publicAccessRulesEnabled(true)
                            .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .publishImmediately(true)
                            .rssBody("rssBody")
                            .rssSummary("rssSummary")
                            .slug("slug")
                            .state("state")
                            .addTagId(0L)
                            .themeSettingsValues(
                                BlogPost.ThemeSettingsValues.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .translatedFromId("translatedFromId")
                            .translations(
                                BlogPost.Translations.builder()
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
                                BlogPost.WidgetContainers.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .widgets(
                                BlogPost.Widgets.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .user(
                        VersionUser.builder().id("id").email("email").fullName("fullName").build()
                    )
                    .build()
            )
        assertThat(collectionResponseWithTotalVersionBlogPost.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalVersionBlogPost.paging())
            .contains(
                Paging.builder()
                    .next(NextPage.builder().after("").link("").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalVersionBlogPost =
            CollectionResponseWithTotalVersionBlogPost.builder()
                .addResult(
                    VersionBlogPost.builder()
                        .id("id")
                        .object_(
                            BlogPost.builder()
                                .id("id")
                                .abStatus(BlogPost.AbStatus.MASTER)
                                .abTestId("abTestId")
                                .archivedAt(0L)
                                .archivedInDashboard(true)
                                .addAttachedStylesheet(
                                    BlogPost.AttachedStylesheet.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
                                .authorName("authorName")
                                .blogAuthorId("blogAuthorId")
                                .campaign("campaign")
                                .categoryId(0)
                                .contentGroupId("contentGroupId")
                                .contentTypeCategory(BlogPost.ContentTypeCategory._0)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .createdById("createdById")
                                .currentlyPublished(true)
                                .currentState(BlogPost.CurrentState.AUTOMATED)
                                .domain("domain")
                                .dynamicPageDataSourceId("dynamicPageDataSourceId")
                                .dynamicPageDataSourceType(0)
                                .dynamicPageHubDbTableId("dynamicPageHubDbTableId")
                                .enableDomainStylesheets(true)
                                .enableGoogleAmpOutputOverride(true)
                                .enableLayoutStylesheets(true)
                                .featuredImage("featuredImage")
                                .featuredImageAltText("featuredImageAltText")
                                .folderId("folderId")
                                .footerHtml("footerHtml")
                                .headHtml("headHtml")
                                .htmlTitle("htmlTitle")
                                .includeDefaultCustomCss(true)
                                .language(BlogPost.Language.AF)
                                .layoutSections(
                                    BlogPost.LayoutSections.builder()
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
                                                    "params" to
                                                        mapOf("foo" to mapOf<String, Any>()),
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
                                                                                "imageUrl" to
                                                                                    "imageUrl",
                                                                            ),
                                                                        "flexboxPositioning" to
                                                                            "flexboxPositioning",
                                                                        "forceFullWidthSection" to
                                                                            true,
                                                                        "maxWidthSectionCentering" to
                                                                            0,
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
                                .password("password")
                                .postBody("postBody")
                                .postSummary("postSummary")
                                .addPublicAccessRule(PublicAccessRule.builder().build())
                                .publicAccessRulesEnabled(true)
                                .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .publishImmediately(true)
                                .rssBody("rssBody")
                                .rssSummary("rssSummary")
                                .slug("slug")
                                .state("state")
                                .addTagId(0L)
                                .themeSettingsValues(
                                    BlogPost.ThemeSettingsValues.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
                                .translatedFromId("translatedFromId")
                                .translations(
                                    BlogPost.Translations.builder()
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
                                                    "publicAccessRules" to
                                                        listOf(mapOf<String, Any>()),
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
                                    BlogPost.WidgetContainers.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
                                .widgets(
                                    BlogPost.Widgets.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .user(
                            VersionUser.builder()
                                .id("id")
                                .email("email")
                                .fullName("fullName")
                                .build()
                        )
                        .build()
                )
                .total(0)
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalVersionBlogPost =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalVersionBlogPost),
                jacksonTypeRef<CollectionResponseWithTotalVersionBlogPost>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalVersionBlogPost)
            .isEqualTo(collectionResponseWithTotalVersionBlogPost)
    }
}
