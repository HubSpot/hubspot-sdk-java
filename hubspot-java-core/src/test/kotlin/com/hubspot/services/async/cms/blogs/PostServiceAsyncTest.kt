// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.cms.blogs

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.patch
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.core.JsonValue
import com.hubspot.models.cms.ContentCloneRequestVNext
import com.hubspot.models.cms.ContentScheduleRequestVNext
import com.hubspot.models.cms.PublicAccessRule
import com.hubspot.models.cms.blogs.posts.BlogPost
import com.hubspot.models.cms.blogs.posts.PostDeleteParams
import com.hubspot.models.cms.blogs.posts.PostGetParams
import com.hubspot.models.cms.blogs.posts.PostListAuthorsParams
import com.hubspot.models.cms.blogs.posts.PostListParams
import com.hubspot.models.cms.blogs.posts.PostListTagsParams
import com.hubspot.models.cms.blogs.posts.PostQueryAuthorsParams
import com.hubspot.models.cms.blogs.posts.PostQueryParams
import com.hubspot.models.cms.blogs.posts.PostQueryTagsParams
import com.hubspot.models.cms.blogs.posts.PostUpdateDraftParams
import com.hubspot.models.cms.blogs.posts.PostUpdateParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class PostServiceAsyncTest {

    @Test
    fun create(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val postServiceAsync = client.cms().blogs().posts()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val postFuture =
            postServiceAsync.create(
                BlogPost.builder()
                    .id("id")
                    .abStatus(BlogPost.AbStatus.AUTOMATED_LOSER_VARIANT)
                    .abTestId("abTestId")
                    .archivedAt(0L)
                    .archivedInDashboard(true)
                    .addAttachedStylesheet(
                        BlogPost.AttachedStylesheet.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
                    .currentState(BlogPost.CurrentState.AGENT_GENERATED)
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
                    .language(BlogPost.Language.AA)
                    .layoutSections(
                        BlogPost.LayoutSections.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "cells" to listOf<Any>(),
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
                                                                            "units" to "deg",
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
                                                                                "CENTER",
                                                                            "verticalSide" to
                                                                                "BOTTOM",
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
                                                            "flexboxPositioning" to "BOTTOM_CENTER",
                                                            "forceFullWidthSection" to true,
                                                            "maxWidthSectionCentering" to 0,
                                                            "verticalAlignment" to "BOTTOM",
                                                            "breakpointStyles" to
                                                                mapOf(
                                                                    "foo" to
                                                                        mapOf(
                                                                            "hidden" to true,
                                                                            "margin" to
                                                                                mapOf(
                                                                                    "bottom" to
                                                                                        mapOf(
                                                                                            "units" to
                                                                                                "%",
                                                                                            "value" to
                                                                                                0,
                                                                                        ),
                                                                                    "top" to
                                                                                        mapOf(
                                                                                            "units" to
                                                                                                "%",
                                                                                            "value" to
                                                                                                0,
                                                                                        ),
                                                                                ),
                                                                            "padding" to
                                                                                mapOf(
                                                                                    "bottom" to
                                                                                        mapOf(
                                                                                            "units" to
                                                                                                "%",
                                                                                            "value" to
                                                                                                0,
                                                                                        ),
                                                                                    "left" to
                                                                                        mapOf(
                                                                                            "units" to
                                                                                                "%",
                                                                                            "value" to
                                                                                                0,
                                                                                        ),
                                                                                    "right" to
                                                                                        mapOf(
                                                                                            "units" to
                                                                                                "%",
                                                                                            "value" to
                                                                                                0,
                                                                                        ),
                                                                                    "top" to
                                                                                        mapOf(
                                                                                            "units" to
                                                                                                "%",
                                                                                            "value" to
                                                                                                0,
                                                                                        ),
                                                                                ),
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
                                                            mapOf("units" to "deg", "value" to 0),
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
                                                                "horizontalSide" to "CENTER",
                                                                "verticalSide" to "BOTTOM",
                                                            ),
                                                    ),
                                                "backgroundImage" to
                                                    mapOf(
                                                        "backgroundPosition" to
                                                            "backgroundPosition",
                                                        "backgroundSize" to "backgroundSize",
                                                        "imageUrl" to "imageUrl",
                                                    ),
                                                "flexboxPositioning" to "BOTTOM_CENTER",
                                                "forceFullWidthSection" to true,
                                                "maxWidthSectionCentering" to 0,
                                                "verticalAlignment" to "BOTTOM",
                                                "breakpointStyles" to
                                                    mapOf(
                                                        "foo" to
                                                            mapOf(
                                                                "hidden" to true,
                                                                "margin" to
                                                                    mapOf(
                                                                        "bottom" to
                                                                            mapOf(
                                                                                "units" to "%",
                                                                                "value" to 0,
                                                                            ),
                                                                        "top" to
                                                                            mapOf(
                                                                                "units" to "%",
                                                                                "value" to 0,
                                                                            ),
                                                                    ),
                                                                "padding" to
                                                                    mapOf(
                                                                        "bottom" to
                                                                            mapOf(
                                                                                "units" to "%",
                                                                                "value" to 0,
                                                                            ),
                                                                        "left" to
                                                                            mapOf(
                                                                                "units" to "%",
                                                                                "value" to 0,
                                                                            ),
                                                                        "right" to
                                                                            mapOf(
                                                                                "units" to "%",
                                                                                "value" to 0,
                                                                            ),
                                                                        "top" to
                                                                            mapOf(
                                                                                "units" to "%",
                                                                                "value" to 0,
                                                                            ),
                                                                    ),
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
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
                                        "campaignName" to "campaignName",
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
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .widgets(
                        BlogPost.Widgets.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        val post = postFuture.get()
        assertThat(post.body()).hasContent("abc")
    }

    @Test
    fun update(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val postServiceAsync = client.cms().blogs().posts()
        stubFor(patch(anyUrl()).willReturn(ok().withBody("abc")))

        val postFuture =
            postServiceAsync.update(
                PostUpdateParams.builder()
                    .objectId("objectId")
                    .archived(true)
                    .blogPost(
                        BlogPost.builder()
                            .id("id")
                            .abStatus(BlogPost.AbStatus.AUTOMATED_LOSER_VARIANT)
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
                            .currentState(BlogPost.CurrentState.AGENT_GENERATED)
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
                            .language(BlogPost.Language.AA)
                            .layoutSections(
                                BlogPost.LayoutSections.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            mapOf(
                                                "cells" to listOf<Any>(),
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
                                                                                        "deg",
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
                                                                                        "CENTER",
                                                                                    "verticalSide" to
                                                                                        "BOTTOM",
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
                                                                        "BOTTOM_CENTER",
                                                                    "forceFullWidthSection" to true,
                                                                    "maxWidthSectionCentering" to 0,
                                                                    "verticalAlignment" to "BOTTOM",
                                                                    "breakpointStyles" to
                                                                        mapOf(
                                                                            "foo" to
                                                                                mapOf(
                                                                                    "hidden" to
                                                                                        true,
                                                                                    "margin" to
                                                                                        mapOf(
                                                                                            "bottom" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                            "top" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                        ),
                                                                                    "padding" to
                                                                                        mapOf(
                                                                                            "bottom" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                            "left" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                            "right" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                            "top" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                        ),
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
                                                                        "units" to "deg",
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
                                                                            "CENTER",
                                                                        "verticalSide" to "BOTTOM",
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
                                                        "flexboxPositioning" to "BOTTOM_CENTER",
                                                        "forceFullWidthSection" to true,
                                                        "maxWidthSectionCentering" to 0,
                                                        "verticalAlignment" to "BOTTOM",
                                                        "breakpointStyles" to
                                                            mapOf(
                                                                "foo" to
                                                                    mapOf(
                                                                        "hidden" to true,
                                                                        "margin" to
                                                                            mapOf(
                                                                                "bottom" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "top" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                            ),
                                                                        "padding" to
                                                                            mapOf(
                                                                                "bottom" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "left" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "right" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "top" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                            ),
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
                                                "campaignName" to "campaignName",
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
                    .build()
            )

        val post = postFuture.get()
        assertThat(post.body()).hasContent("abc")
    }

    @Test
    fun list(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val postServiceAsync = client.cms().blogs().posts()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val postsFuture =
            postServiceAsync.list(
                PostListParams.builder()
                    .after("after")
                    .archived(true)
                    .createdAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(0)
                    .property("property")
                    .addSort("string")
                    .updatedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val posts = postsFuture.get()
        assertThat(posts.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val postServiceAsync = client.cms().blogs().posts()

        val future =
            postServiceAsync.delete(
                PostDeleteParams.builder().objectId("objectId").archived(true).build()
            )

        val response = future.get()
    }

    @Test
    fun clone(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val postServiceAsync = client.cms().blogs().posts()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            postServiceAsync.clone(
                ContentCloneRequestVNext.builder().id("id").cloneName("cloneName").build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun get(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val postServiceAsync = client.cms().blogs().posts()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val postFuture =
            postServiceAsync.get(
                PostGetParams.builder()
                    .objectId("objectId")
                    .archived(true)
                    .property("property")
                    .build()
            )

        val post = postFuture.get()
        assertThat(post.body()).hasContent("abc")
    }

    @Test
    fun getDraftById(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val postServiceAsync = client.cms().blogs().posts()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture = postServiceAsync.getDraftById("objectId")

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun listAuthors(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val postServiceAsync = client.cms().blogs().posts()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            postServiceAsync.listAuthors(
                PostListAuthorsParams.builder()
                    .after("after")
                    .archived(true)
                    .createdAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(0)
                    .property("property")
                    .addSort("string")
                    .updatedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun listTags(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val postServiceAsync = client.cms().blogs().posts()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            postServiceAsync.listTags(
                PostListTagsParams.builder()
                    .after("after")
                    .archived(true)
                    .createdAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(0)
                    .property("property")
                    .addSort("string")
                    .updatedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun pushLive() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val postServiceAsync = client.cms().blogs().posts()

        val future = postServiceAsync.pushLive("objectId")

        val response = future.get()
    }

    @Test
    fun query(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val postServiceAsync = client.cms().blogs().posts()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            postServiceAsync.query(
                PostQueryParams.builder()
                    .after("after")
                    .archived(true)
                    .createdAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(0)
                    .property("property")
                    .addSort("string")
                    .updatedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun queryAuthors(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val postServiceAsync = client.cms().blogs().posts()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            postServiceAsync.queryAuthors(
                PostQueryAuthorsParams.builder()
                    .after("after")
                    .archived(true)
                    .createdAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(0)
                    .property("property")
                    .addSort("string")
                    .updatedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun queryTags(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val postServiceAsync = client.cms().blogs().posts()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            postServiceAsync.queryTags(
                PostQueryTagsParams.builder()
                    .after("after")
                    .archived(true)
                    .createdAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(0)
                    .property("property")
                    .addSort("string")
                    .updatedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun resetDraft() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val postServiceAsync = client.cms().blogs().posts()

        val future = postServiceAsync.resetDraft("objectId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun schedule() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val postServiceAsync = client.cms().blogs().posts()

        val future =
            postServiceAsync.schedule(
                ContentScheduleRequestVNext.builder()
                    .id("id")
                    .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun updateDraft(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val postServiceAsync = client.cms().blogs().posts()
        stubFor(patch(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            postServiceAsync.updateDraft(
                PostUpdateDraftParams.builder()
                    .objectId("objectId")
                    .blogPost(
                        BlogPost.builder()
                            .id("id")
                            .abStatus(BlogPost.AbStatus.AUTOMATED_LOSER_VARIANT)
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
                            .currentState(BlogPost.CurrentState.AGENT_GENERATED)
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
                            .language(BlogPost.Language.AA)
                            .layoutSections(
                                BlogPost.LayoutSections.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            mapOf(
                                                "cells" to listOf<Any>(),
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
                                                                                        "deg",
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
                                                                                        "CENTER",
                                                                                    "verticalSide" to
                                                                                        "BOTTOM",
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
                                                                        "BOTTOM_CENTER",
                                                                    "forceFullWidthSection" to true,
                                                                    "maxWidthSectionCentering" to 0,
                                                                    "verticalAlignment" to "BOTTOM",
                                                                    "breakpointStyles" to
                                                                        mapOf(
                                                                            "foo" to
                                                                                mapOf(
                                                                                    "hidden" to
                                                                                        true,
                                                                                    "margin" to
                                                                                        mapOf(
                                                                                            "bottom" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                            "top" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                        ),
                                                                                    "padding" to
                                                                                        mapOf(
                                                                                            "bottom" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                            "left" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                            "right" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                            "top" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                        ),
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
                                                                        "units" to "deg",
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
                                                                            "CENTER",
                                                                        "verticalSide" to "BOTTOM",
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
                                                        "flexboxPositioning" to "BOTTOM_CENTER",
                                                        "forceFullWidthSection" to true,
                                                        "maxWidthSectionCentering" to 0,
                                                        "verticalAlignment" to "BOTTOM",
                                                        "breakpointStyles" to
                                                            mapOf(
                                                                "foo" to
                                                                    mapOf(
                                                                        "hidden" to true,
                                                                        "margin" to
                                                                            mapOf(
                                                                                "bottom" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "top" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                            ),
                                                                        "padding" to
                                                                            mapOf(
                                                                                "bottom" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "left" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "right" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "top" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                            ),
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
                                                "campaignName" to "campaignName",
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
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }
}
