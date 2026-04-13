// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.transactional

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.ForwardPaging
import com.hubspot.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseSmtpApiTokenViewForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseSmtpApiTokenViewForwardPaging =
            CollectionResponseSmtpApiTokenViewForwardPaging.builder()
                .addResult(
                    SmtpApiTokenView.builder()
                        .id("id")
                        .campaignName("campaignName")
                        .createContact(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdBy("createdBy")
                        .emailCampaignId("emailCampaignId")
                        .password("password")
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseSmtpApiTokenViewForwardPaging.results())
            .containsExactly(
                SmtpApiTokenView.builder()
                    .id("id")
                    .campaignName("campaignName")
                    .createContact(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdBy("createdBy")
                    .emailCampaignId("emailCampaignId")
                    .password("password")
                    .build()
            )
        assertThat(collectionResponseSmtpApiTokenViewForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseSmtpApiTokenViewForwardPaging =
            CollectionResponseSmtpApiTokenViewForwardPaging.builder()
                .addResult(
                    SmtpApiTokenView.builder()
                        .id("id")
                        .campaignName("campaignName")
                        .createContact(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdBy("createdBy")
                        .emailCampaignId("emailCampaignId")
                        .password("password")
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseSmtpApiTokenViewForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseSmtpApiTokenViewForwardPaging),
                jacksonTypeRef<CollectionResponseSmtpApiTokenViewForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseSmtpApiTokenViewForwardPaging)
            .isEqualTo(collectionResponseSmtpApiTokenViewForwardPaging)
    }
}
