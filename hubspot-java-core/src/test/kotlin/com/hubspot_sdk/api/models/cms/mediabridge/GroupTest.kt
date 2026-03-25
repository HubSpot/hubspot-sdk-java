// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupTest {

    @Test
    fun create() {
        val group =
            Group.builder()
                .deleted(true)
                .displayName("displayName")
                .displayOrder(0)
                .fulcrumPortalId(0)
                .fulcrumTimestamp(0L)
                .hubspotDefined(true)
                .name("name")
                .portalId(0L)
                .build()

        assertThat(group.deleted()).isEqualTo(true)
        assertThat(group.displayName()).isEqualTo("displayName")
        assertThat(group.displayOrder()).isEqualTo(0)
        assertThat(group.fulcrumPortalId()).isEqualTo(0)
        assertThat(group.fulcrumTimestamp()).isEqualTo(0L)
        assertThat(group.hubspotDefined()).isEqualTo(true)
        assertThat(group.name()).isEqualTo("name")
        assertThat(group.portalId()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val group =
            Group.builder()
                .deleted(true)
                .displayName("displayName")
                .displayOrder(0)
                .fulcrumPortalId(0)
                .fulcrumTimestamp(0L)
                .hubspotDefined(true)
                .name("name")
                .portalId(0L)
                .build()

        val roundtrippedGroup =
            jsonMapper.readValue(jsonMapper.writeValueAsString(group), jacksonTypeRef<Group>())

        assertThat(roundtrippedGroup).isEqualTo(group)
    }
}
