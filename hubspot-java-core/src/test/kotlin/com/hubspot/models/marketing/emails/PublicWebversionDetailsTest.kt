// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicWebversionDetailsTest {

    @Test
    fun create() {
        val publicWebversionDetails =
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

        assertThat(publicWebversionDetails.domain()).contains("domain")
        assertThat(publicWebversionDetails.enabled()).contains(true)
        assertThat(publicWebversionDetails.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicWebversionDetails.isPageRedirected()).contains(true)
        assertThat(publicWebversionDetails.metaDescription()).contains("metaDescription")
        assertThat(publicWebversionDetails.pageExpiryEnabled()).contains(true)
        assertThat(publicWebversionDetails.redirectToPageId()).contains("redirectToPageId")
        assertThat(publicWebversionDetails.redirectToUrl()).contains("redirectToUrl")
        assertThat(publicWebversionDetails.slug()).contains("slug")
        assertThat(publicWebversionDetails.title()).contains("title")
        assertThat(publicWebversionDetails.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicWebversionDetails =
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

        val roundtrippedPublicWebversionDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicWebversionDetails),
                jacksonTypeRef<PublicWebversionDetails>(),
            )

        assertThat(roundtrippedPublicWebversionDetails).isEqualTo(publicWebversionDetails)
    }
}
