// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.emails

import com.hubspot.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailListParamsTest {

    @Test
    fun create() {
        EmailListParams.builder()
            .after("after")
            .archived(true)
            .campaign("campaign")
            .createdAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addIncludedProperty("string")
            .includeStats(true)
            .isPublished(true)
            .limit(0)
            .marketingCampaignNames(true)
            .publishedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .publishedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addSort("string")
            .type(EmailListParams.Type.AB_EMAIL)
            .updatedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .updatedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .variantStats(true)
            .workflowNames(true)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EmailListParams.builder()
                .after("after")
                .archived(true)
                .campaign("campaign")
                .createdAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addIncludedProperty("string")
                .includeStats(true)
                .isPublished(true)
                .limit(0)
                .marketingCampaignNames(true)
                .publishedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .publishedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addSort("string")
                .type(EmailListParams.Type.AB_EMAIL)
                .updatedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .variantStats(true)
                .workflowNames(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("archived", "true")
                    .put("campaign", "campaign")
                    .put("createdAfter", "2019-12-27T18:11:19.117Z")
                    .put("createdAt", "2019-12-27T18:11:19.117Z")
                    .put("createdBefore", "2019-12-27T18:11:19.117Z")
                    .put("includedProperties", listOf("string").joinToString(","))
                    .put("includeStats", "true")
                    .put("isPublished", "true")
                    .put("limit", "0")
                    .put("marketingCampaignNames", "true")
                    .put("publishedAfter", "2019-12-27T18:11:19.117Z")
                    .put("publishedAt", "2019-12-27T18:11:19.117Z")
                    .put("publishedBefore", "2019-12-27T18:11:19.117Z")
                    .put("sort", listOf("string").joinToString(","))
                    .put("type", "AB_EMAIL")
                    .put("updatedAfter", "2019-12-27T18:11:19.117Z")
                    .put("updatedAt", "2019-12-27T18:11:19.117Z")
                    .put("updatedBefore", "2019-12-27T18:11:19.117Z")
                    .put("variantStats", "true")
                    .put("workflowNames", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EmailListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
