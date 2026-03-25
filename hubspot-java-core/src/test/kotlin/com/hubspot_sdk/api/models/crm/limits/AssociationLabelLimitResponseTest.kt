// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ObjectTypeDefinition
import com.hubspot_sdk.api.models.ObjectTypeDefinitionLabels
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationLabelLimitResponseTest {

    @Test
    fun create() {
        val associationLabelLimitResponse =
            AssociationLabelLimitResponse.builder()
                .addAllLabel("string")
                .fromObjectType(
                    ObjectTypeDefinition.builder()
                        .id("id")
                        .allowsSensitiveProperties(true)
                        .archived(true)
                        .fullyQualifiedName("fullyQualifiedName")
                        .labels(
                            ObjectTypeDefinitionLabels.builder()
                                .plural("plural")
                                .singular("singular")
                                .build()
                        )
                        .name("name")
                        .objectTypeId("objectTypeId")
                        .addRequiredProperty("string")
                        .addSearchableProperty("string")
                        .addSecondaryDisplayProperty("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .portalId(0)
                        .primaryDisplayProperty("primaryDisplayProperty")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .limit(0)
                .percentage(0.0)
                .toObjectType(
                    ObjectTypeDefinition.builder()
                        .id("id")
                        .allowsSensitiveProperties(true)
                        .archived(true)
                        .fullyQualifiedName("fullyQualifiedName")
                        .labels(
                            ObjectTypeDefinitionLabels.builder()
                                .plural("plural")
                                .singular("singular")
                                .build()
                        )
                        .name("name")
                        .objectTypeId("objectTypeId")
                        .addRequiredProperty("string")
                        .addSearchableProperty("string")
                        .addSecondaryDisplayProperty("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .portalId(0)
                        .primaryDisplayProperty("primaryDisplayProperty")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .usage(0)
                .build()

        assertThat(associationLabelLimitResponse.allLabels()).containsExactly("string")
        assertThat(associationLabelLimitResponse.fromObjectType())
            .isEqualTo(
                ObjectTypeDefinition.builder()
                    .id("id")
                    .allowsSensitiveProperties(true)
                    .archived(true)
                    .fullyQualifiedName("fullyQualifiedName")
                    .labels(
                        ObjectTypeDefinitionLabels.builder()
                            .plural("plural")
                            .singular("singular")
                            .build()
                    )
                    .name("name")
                    .objectTypeId("objectTypeId")
                    .addRequiredProperty("string")
                    .addSearchableProperty("string")
                    .addSecondaryDisplayProperty("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .portalId(0)
                    .primaryDisplayProperty("primaryDisplayProperty")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(associationLabelLimitResponse.limit()).isEqualTo(0)
        assertThat(associationLabelLimitResponse.percentage()).isEqualTo(0.0)
        assertThat(associationLabelLimitResponse.toObjectType())
            .isEqualTo(
                ObjectTypeDefinition.builder()
                    .id("id")
                    .allowsSensitiveProperties(true)
                    .archived(true)
                    .fullyQualifiedName("fullyQualifiedName")
                    .labels(
                        ObjectTypeDefinitionLabels.builder()
                            .plural("plural")
                            .singular("singular")
                            .build()
                    )
                    .name("name")
                    .objectTypeId("objectTypeId")
                    .addRequiredProperty("string")
                    .addSearchableProperty("string")
                    .addSecondaryDisplayProperty("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .portalId(0)
                    .primaryDisplayProperty("primaryDisplayProperty")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(associationLabelLimitResponse.usage()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associationLabelLimitResponse =
            AssociationLabelLimitResponse.builder()
                .addAllLabel("string")
                .fromObjectType(
                    ObjectTypeDefinition.builder()
                        .id("id")
                        .allowsSensitiveProperties(true)
                        .archived(true)
                        .fullyQualifiedName("fullyQualifiedName")
                        .labels(
                            ObjectTypeDefinitionLabels.builder()
                                .plural("plural")
                                .singular("singular")
                                .build()
                        )
                        .name("name")
                        .objectTypeId("objectTypeId")
                        .addRequiredProperty("string")
                        .addSearchableProperty("string")
                        .addSecondaryDisplayProperty("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .portalId(0)
                        .primaryDisplayProperty("primaryDisplayProperty")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .limit(0)
                .percentage(0.0)
                .toObjectType(
                    ObjectTypeDefinition.builder()
                        .id("id")
                        .allowsSensitiveProperties(true)
                        .archived(true)
                        .fullyQualifiedName("fullyQualifiedName")
                        .labels(
                            ObjectTypeDefinitionLabels.builder()
                                .plural("plural")
                                .singular("singular")
                                .build()
                        )
                        .name("name")
                        .objectTypeId("objectTypeId")
                        .addRequiredProperty("string")
                        .addSearchableProperty("string")
                        .addSecondaryDisplayProperty("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .portalId(0)
                        .primaryDisplayProperty("primaryDisplayProperty")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .usage(0)
                .build()

        val roundtrippedAssociationLabelLimitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationLabelLimitResponse),
                jacksonTypeRef<AssociationLabelLimitResponse>(),
            )

        assertThat(roundtrippedAssociationLabelLimitResponse)
            .isEqualTo(associationLabelLimitResponse)
    }
}
