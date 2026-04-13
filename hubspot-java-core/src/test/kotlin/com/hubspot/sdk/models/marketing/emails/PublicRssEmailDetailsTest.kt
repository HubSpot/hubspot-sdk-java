// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicRssEmailDetailsTest {

    @Test
    fun create() {
        val publicRssEmailDetails =
            PublicRssEmailDetails.builder()
                .blogEmailType("blogEmailType")
                .blogImageMaxWidth(0)
                .blogLayout(PublicRssEmailDetails.BlogLayout.FULL_POST)
                .hubSpotBlogId("hubspotBlogId")
                .maxEntries(0)
                .rssEntryTemplate("rssEntryTemplate")
                .timing(
                    PublicRssEmailDetails.Timing.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .url("url")
                .useHeadlineAsSubject(true)
                .build()

        assertThat(publicRssEmailDetails.blogEmailType()).contains("blogEmailType")
        assertThat(publicRssEmailDetails.blogImageMaxWidth()).contains(0)
        assertThat(publicRssEmailDetails.blogLayout())
            .contains(PublicRssEmailDetails.BlogLayout.FULL_POST)
        assertThat(publicRssEmailDetails.hubSpotBlogId()).contains("hubspotBlogId")
        assertThat(publicRssEmailDetails.maxEntries()).contains(0)
        assertThat(publicRssEmailDetails.rssEntryTemplate()).contains("rssEntryTemplate")
        assertThat(publicRssEmailDetails.timing())
            .contains(
                PublicRssEmailDetails.Timing.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(publicRssEmailDetails.url()).contains("url")
        assertThat(publicRssEmailDetails.useHeadlineAsSubject()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicRssEmailDetails =
            PublicRssEmailDetails.builder()
                .blogEmailType("blogEmailType")
                .blogImageMaxWidth(0)
                .blogLayout(PublicRssEmailDetails.BlogLayout.FULL_POST)
                .hubSpotBlogId("hubspotBlogId")
                .maxEntries(0)
                .rssEntryTemplate("rssEntryTemplate")
                .timing(
                    PublicRssEmailDetails.Timing.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .url("url")
                .useHeadlineAsSubject(true)
                .build()

        val roundtrippedPublicRssEmailDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicRssEmailDetails),
                jacksonTypeRef<PublicRssEmailDetails>(),
            )

        assertThat(roundtrippedPublicRssEmailDetails).isEqualTo(publicRssEmailDetails)
    }
}
