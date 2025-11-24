// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationDefinitionTest {

    @Test
    fun create() {
        val associationDefinition =
            AssociationDefinition.builder()
                .id(0)
                .allowsCustomLabels(true)
                .cardinality(AssociationDefinition.Cardinality.ONE_TO_MANY)
                .category(AssociationDefinition.Category.HUBSPOT_DEFINED)
                .fromObjectTypeId("fromObjectTypeId")
                .hasAllAssociatedObjects(true)
                .hasCascadingDeletes(true)
                .hasUserEnforcedMaxFromObjectIds(true)
                .hasUserEnforcedMaxToObjectIds(true)
                .hidden(true)
                .inverseAllowsCustomLabels(true)
                .inverseCardinality(AssociationDefinition.InverseCardinality.ONE_TO_MANY)
                .inverseHasAllAssociatedObjects(true)
                .inverseId(0)
                .inverseName("inverseName")
                .isInversePrimary(true)
                .isPrimary(true)
                .maxFromObjectIds(0)
                .maxToObjectIds(0)
                .name("name")
                .portalUniqueIdentifier("portalUniqueIdentifier")
                .toObjectTypeId("toObjectTypeId")
                .fromObjectType(AssociationDefinition.FromObjectType.ABANDONED_CART)
                .inverseLabel("inverseLabel")
                .label("label")
                .toObjectType(AssociationDefinition.ToObjectType.ABANDONED_CART)
                .build()

        assertThat(associationDefinition.id()).isEqualTo(0)
        assertThat(associationDefinition.allowsCustomLabels()).isEqualTo(true)
        assertThat(associationDefinition.cardinality())
            .isEqualTo(AssociationDefinition.Cardinality.ONE_TO_MANY)
        assertThat(associationDefinition.category())
            .isEqualTo(AssociationDefinition.Category.HUBSPOT_DEFINED)
        assertThat(associationDefinition.fromObjectTypeId()).isEqualTo("fromObjectTypeId")
        assertThat(associationDefinition.hasAllAssociatedObjects()).isEqualTo(true)
        assertThat(associationDefinition.hasCascadingDeletes()).isEqualTo(true)
        assertThat(associationDefinition.hasUserEnforcedMaxFromObjectIds()).isEqualTo(true)
        assertThat(associationDefinition.hasUserEnforcedMaxToObjectIds()).isEqualTo(true)
        assertThat(associationDefinition.hidden()).isEqualTo(true)
        assertThat(associationDefinition.inverseAllowsCustomLabels()).isEqualTo(true)
        assertThat(associationDefinition.inverseCardinality())
            .isEqualTo(AssociationDefinition.InverseCardinality.ONE_TO_MANY)
        assertThat(associationDefinition.inverseHasAllAssociatedObjects()).isEqualTo(true)
        assertThat(associationDefinition.inverseId()).isEqualTo(0)
        assertThat(associationDefinition.inverseName()).isEqualTo("inverseName")
        assertThat(associationDefinition.isInversePrimary()).isEqualTo(true)
        assertThat(associationDefinition.isPrimary()).isEqualTo(true)
        assertThat(associationDefinition.maxFromObjectIds()).isEqualTo(0)
        assertThat(associationDefinition.maxToObjectIds()).isEqualTo(0)
        assertThat(associationDefinition.name()).isEqualTo("name")
        assertThat(associationDefinition.portalUniqueIdentifier())
            .isEqualTo("portalUniqueIdentifier")
        assertThat(associationDefinition.toObjectTypeId()).isEqualTo("toObjectTypeId")
        assertThat(associationDefinition.fromObjectType())
            .contains(AssociationDefinition.FromObjectType.ABANDONED_CART)
        assertThat(associationDefinition.inverseLabel()).contains("inverseLabel")
        assertThat(associationDefinition.label()).contains("label")
        assertThat(associationDefinition.toObjectType())
            .contains(AssociationDefinition.ToObjectType.ABANDONED_CART)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associationDefinition =
            AssociationDefinition.builder()
                .id(0)
                .allowsCustomLabels(true)
                .cardinality(AssociationDefinition.Cardinality.ONE_TO_MANY)
                .category(AssociationDefinition.Category.HUBSPOT_DEFINED)
                .fromObjectTypeId("fromObjectTypeId")
                .hasAllAssociatedObjects(true)
                .hasCascadingDeletes(true)
                .hasUserEnforcedMaxFromObjectIds(true)
                .hasUserEnforcedMaxToObjectIds(true)
                .hidden(true)
                .inverseAllowsCustomLabels(true)
                .inverseCardinality(AssociationDefinition.InverseCardinality.ONE_TO_MANY)
                .inverseHasAllAssociatedObjects(true)
                .inverseId(0)
                .inverseName("inverseName")
                .isInversePrimary(true)
                .isPrimary(true)
                .maxFromObjectIds(0)
                .maxToObjectIds(0)
                .name("name")
                .portalUniqueIdentifier("portalUniqueIdentifier")
                .toObjectTypeId("toObjectTypeId")
                .fromObjectType(AssociationDefinition.FromObjectType.ABANDONED_CART)
                .inverseLabel("inverseLabel")
                .label("label")
                .toObjectType(AssociationDefinition.ToObjectType.ABANDONED_CART)
                .build()

        val roundtrippedAssociationDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationDefinition),
                jacksonTypeRef<AssociationDefinition>(),
            )

        assertThat(roundtrippedAssociationDefinition).isEqualTo(associationDefinition)
    }
}
