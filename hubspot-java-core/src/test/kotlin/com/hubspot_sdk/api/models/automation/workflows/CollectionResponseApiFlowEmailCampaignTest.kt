// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.marketing.emails.EmailsPaging
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseApiFlowEmailCampaignTest {

    @Test
    fun create() {
        val collectionResponseApiFlowEmailCampaign =
            CollectionResponseApiFlowEmailCampaign.builder()
                .addResult(
                    ApiFlowEmailCampaign.builder()
                        .emailCampaignId("emailCampaignId")
                        .emailContentId("emailContentId")
                        .flowId("flowId")
                        .build()
                )
                .paging(
                    EmailsPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseApiFlowEmailCampaign.results())
            .containsExactly(
                ApiFlowEmailCampaign.builder()
                    .emailCampaignId("emailCampaignId")
                    .emailContentId("emailContentId")
                    .flowId("flowId")
                    .build()
            )
        assertThat(collectionResponseApiFlowEmailCampaign.paging())
            .contains(
                EmailsPaging.builder()
                    .next(NextPage.builder().after("").link("").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseApiFlowEmailCampaign =
            CollectionResponseApiFlowEmailCampaign.builder()
                .addResult(
                    ApiFlowEmailCampaign.builder()
                        .emailCampaignId("emailCampaignId")
                        .emailContentId("emailContentId")
                        .flowId("flowId")
                        .build()
                )
                .paging(
                    EmailsPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseApiFlowEmailCampaign =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseApiFlowEmailCampaign),
                jacksonTypeRef<CollectionResponseApiFlowEmailCampaign>(),
            )

        assertThat(roundtrippedCollectionResponseApiFlowEmailCampaign)
            .isEqualTo(collectionResponseApiFlowEmailCampaign)
    }
}
