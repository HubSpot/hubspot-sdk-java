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
                .allowsCustomLabels(false)
                .cardinality(AssociationDefinition.Cardinality.ONE_TO_ONE)
                .category(AssociationDefinition.Category.HUBSPOT_DEFINED)
                .fromObjectTypeId("")
                .hasAllAssociatedObjects(false)
                .hasCascadingDeletes(false)
                .hasUserEnforcedMaxFromObjectIds(false)
                .hasUserEnforcedMaxToObjectIds(false)
                .hidden(false)
                .inverseAllowsCustomLabels(false)
                .inverseCardinality(AssociationDefinition.InverseCardinality.ONE_TO_ONE)
                .inverseHasAllAssociatedObjects(false)
                .inverseId(0)
                .inverseName("")
                .isInversePrimary(false)
                .isPrimary(false)
                .maxFromObjectIds(0)
                .maxToObjectIds(0)
                .name("")
                .portalUniqueIdentifier("")
                .toObjectTypeId("")
                .fromObjectType(AssociationDefinition.FromObjectType.CONTACT)
                .inverseLabel("")
                .label("")
                .toObjectType(AssociationDefinition.ToObjectType.CONTACT)
                .build()

        assertThat(associationDefinition.id()).isEqualTo(0)
        assertThat(associationDefinition.allowsCustomLabels()).isEqualTo(false)
        assertThat(associationDefinition.cardinality())
            .isEqualTo(AssociationDefinition.Cardinality.ONE_TO_ONE)
        assertThat(associationDefinition.category())
            .isEqualTo(AssociationDefinition.Category.HUBSPOT_DEFINED)
        assertThat(associationDefinition.fromObjectTypeId()).isEqualTo("")
        assertThat(associationDefinition.hasAllAssociatedObjects()).isEqualTo(false)
        assertThat(associationDefinition.hasCascadingDeletes()).isEqualTo(false)
        assertThat(associationDefinition.hasUserEnforcedMaxFromObjectIds()).isEqualTo(false)
        assertThat(associationDefinition.hasUserEnforcedMaxToObjectIds()).isEqualTo(false)
        assertThat(associationDefinition.hidden()).isEqualTo(false)
        assertThat(associationDefinition.inverseAllowsCustomLabels()).isEqualTo(false)
        assertThat(associationDefinition.inverseCardinality())
            .isEqualTo(AssociationDefinition.InverseCardinality.ONE_TO_ONE)
        assertThat(associationDefinition.inverseHasAllAssociatedObjects()).isEqualTo(false)
        assertThat(associationDefinition.inverseId()).isEqualTo(0)
        assertThat(associationDefinition.inverseName()).isEqualTo("")
        assertThat(associationDefinition.isInversePrimary()).isEqualTo(false)
        assertThat(associationDefinition.isPrimary()).isEqualTo(false)
        assertThat(associationDefinition.maxFromObjectIds()).isEqualTo(0)
        assertThat(associationDefinition.maxToObjectIds()).isEqualTo(0)
        assertThat(associationDefinition.name()).isEqualTo("")
        assertThat(associationDefinition.portalUniqueIdentifier()).isEqualTo("")
        assertThat(associationDefinition.toObjectTypeId()).isEqualTo("")
        assertThat(associationDefinition.fromObjectType())
            .contains(AssociationDefinition.FromObjectType.CONTACT)
        assertThat(associationDefinition.inverseLabel()).contains("")
        assertThat(associationDefinition.label()).contains("")
        assertThat(associationDefinition.toObjectType())
            .contains(AssociationDefinition.ToObjectType.CONTACT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associationDefinition =
            AssociationDefinition.builder()
                .id(0)
                .allowsCustomLabels(false)
                .cardinality(AssociationDefinition.Cardinality.ONE_TO_ONE)
                .category(AssociationDefinition.Category.HUBSPOT_DEFINED)
                .fromObjectTypeId("")
                .hasAllAssociatedObjects(false)
                .hasCascadingDeletes(false)
                .hasUserEnforcedMaxFromObjectIds(false)
                .hasUserEnforcedMaxToObjectIds(false)
                .hidden(false)
                .inverseAllowsCustomLabels(false)
                .inverseCardinality(AssociationDefinition.InverseCardinality.ONE_TO_ONE)
                .inverseHasAllAssociatedObjects(false)
                .inverseId(0)
                .inverseName("")
                .isInversePrimary(false)
                .isPrimary(false)
                .maxFromObjectIds(0)
                .maxToObjectIds(0)
                .name("")
                .portalUniqueIdentifier("")
                .toObjectTypeId("")
                .fromObjectType(AssociationDefinition.FromObjectType.CONTACT)
                .inverseLabel("")
                .label("")
                .toObjectType(AssociationDefinition.ToObjectType.CONTACT)
                .build()

        val roundtrippedAssociationDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationDefinition),
                jacksonTypeRef<AssociationDefinition>(),
            )

        assertThat(roundtrippedAssociationDefinition).isEqualTo(associationDefinition)
    }
}
