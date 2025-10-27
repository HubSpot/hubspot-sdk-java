// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.properties

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreatedResponsePropertyGroupTest {

    @Test
    fun create() {
        val createdResponsePropertyGroup =
            CreatedResponsePropertyGroup.builder()
                .createdResourceId("createdResourceId")
                .entity(
                    PropertyGroup.builder()
                        .archived(true)
                        .displayOrder(-1)
                        .label("My Property Group")
                        .name("mypropertygroup")
                        .build()
                )
                .location("location")
                .build()

        assertThat(createdResponsePropertyGroup.createdResourceId()).isEqualTo("createdResourceId")
        assertThat(createdResponsePropertyGroup.entity())
            .isEqualTo(
                PropertyGroup.builder()
                    .archived(true)
                    .displayOrder(-1)
                    .label("My Property Group")
                    .name("mypropertygroup")
                    .build()
            )
        assertThat(createdResponsePropertyGroup.location()).contains("location")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createdResponsePropertyGroup =
            CreatedResponsePropertyGroup.builder()
                .createdResourceId("createdResourceId")
                .entity(
                    PropertyGroup.builder()
                        .archived(true)
                        .displayOrder(-1)
                        .label("My Property Group")
                        .name("mypropertygroup")
                        .build()
                )
                .location("location")
                .build()

        val roundtrippedCreatedResponsePropertyGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createdResponsePropertyGroup),
                jacksonTypeRef<CreatedResponsePropertyGroup>(),
            )

        assertThat(roundtrippedCreatedResponsePropertyGroup).isEqualTo(createdResponsePropertyGroup)
    }
}
