// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.groups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.crm.properties.PropertyGroup
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupListResponseTest {

    @Test
    fun create() {
        val groupListResponse =
            GroupListResponse.builder()
                .addResult(
                    PropertyGroup.builder()
                        .archived(true)
                        .displayOrder(-1)
                        .label("My Property Group")
                        .name("mypropertygroup")
                        .build()
                )
                .build()

        assertThat(groupListResponse.results())
            .containsExactly(
                PropertyGroup.builder()
                    .archived(true)
                    .displayOrder(-1)
                    .label("My Property Group")
                    .name("mypropertygroup")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groupListResponse =
            GroupListResponse.builder()
                .addResult(
                    PropertyGroup.builder()
                        .archived(true)
                        .displayOrder(-1)
                        .label("My Property Group")
                        .name("mypropertygroup")
                        .build()
                )
                .build()

        val roundtrippedGroupListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groupListResponse),
                jacksonTypeRef<GroupListResponse>(),
            )

        assertThat(roundtrippedGroupListResponse).isEqualTo(groupListResponse)
    }
}
