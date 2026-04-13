// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicCampaignTest {

    @Test
    fun create() {
        val publicCampaign =
            PublicCampaign.builder()
                .id("id")
                .addBusinessUnit(PublicBusinessUnit.builder().id(0).build())
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    PublicCampaign.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(publicCampaign.id()).isEqualTo("id")
        assertThat(publicCampaign.businessUnits())
            .containsExactly(PublicBusinessUnit.builder().id(0).build())
        assertThat(publicCampaign.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicCampaign.properties())
            .isEqualTo(
                PublicCampaign.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(publicCampaign.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicCampaign =
            PublicCampaign.builder()
                .id("id")
                .addBusinessUnit(PublicBusinessUnit.builder().id(0).build())
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    PublicCampaign.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPublicCampaign =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicCampaign),
                jacksonTypeRef<PublicCampaign>(),
            )

        assertThat(roundtrippedPublicCampaign).isEqualTo(publicCampaign)
    }
}
