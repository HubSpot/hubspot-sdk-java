// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupViewTest {

    @Test
    fun create() {
        val groupView =
            GroupView.builder()
                .displayName("displayName")
                .displayOrder(0)
                .fulcrumPortalId(0)
                .fulcrumTimestamp(0L)
                .hubspotDefined(true)
                .name("name")
                .build()

        assertThat(groupView.displayName()).isEqualTo("displayName")
        assertThat(groupView.displayOrder()).isEqualTo(0)
        assertThat(groupView.fulcrumPortalId()).isEqualTo(0)
        assertThat(groupView.fulcrumTimestamp()).isEqualTo(0L)
        assertThat(groupView.hubspotDefined()).isEqualTo(true)
        assertThat(groupView.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groupView =
            GroupView.builder()
                .displayName("displayName")
                .displayOrder(0)
                .fulcrumPortalId(0)
                .fulcrumTimestamp(0L)
                .hubspotDefined(true)
                .name("name")
                .build()

        val roundtrippedGroupView =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groupView),
                jacksonTypeRef<GroupView>(),
            )

        assertThat(roundtrippedGroupView).isEqualTo(groupView)
    }
}
