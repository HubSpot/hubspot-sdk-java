// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicMembershipSettingsTest {

    @Test
    fun create() {
        val publicMembershipSettings =
            PublicMembershipSettings.builder().includeUnassigned(true).membershipTeamId(0).build()

        assertThat(publicMembershipSettings.includeUnassigned()).contains(true)
        assertThat(publicMembershipSettings.membershipTeamId()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicMembershipSettings =
            PublicMembershipSettings.builder().includeUnassigned(true).membershipTeamId(0).build()

        val roundtrippedPublicMembershipSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicMembershipSettings),
                jacksonTypeRef<PublicMembershipSettings>(),
            )

        assertThat(roundtrippedPublicMembershipSettings).isEqualTo(publicMembershipSettings)
    }
}
