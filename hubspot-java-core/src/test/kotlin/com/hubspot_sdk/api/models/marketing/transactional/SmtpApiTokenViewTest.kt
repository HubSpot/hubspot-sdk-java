// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.transactional

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SmtpApiTokenViewTest {

    @Test
    fun create() {
        val smtpApiTokenView =
            SmtpApiTokenView.builder()
                .id("id")
                .campaignName("campaignName")
                .createContact(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("createdBy")
                .emailCampaignId("emailCampaignId")
                .password("password")
                .build()

        assertThat(smtpApiTokenView.id()).isEqualTo("id")
        assertThat(smtpApiTokenView.campaignName()).isEqualTo("campaignName")
        assertThat(smtpApiTokenView.createContact()).isEqualTo(true)
        assertThat(smtpApiTokenView.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(smtpApiTokenView.createdBy()).isEqualTo("createdBy")
        assertThat(smtpApiTokenView.emailCampaignId()).isEqualTo("emailCampaignId")
        assertThat(smtpApiTokenView.password()).contains("password")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val smtpApiTokenView =
            SmtpApiTokenView.builder()
                .id("id")
                .campaignName("campaignName")
                .createContact(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("createdBy")
                .emailCampaignId("emailCampaignId")
                .password("password")
                .build()

        val roundtrippedSmtpApiTokenView =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(smtpApiTokenView),
                jacksonTypeRef<SmtpApiTokenView>(),
            )

        assertThat(roundtrippedSmtpApiTokenView).isEqualTo(smtpApiTokenView)
    }
}
