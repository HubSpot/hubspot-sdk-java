// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects.partnerservices

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.partnerservices.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.crm.objects.partnerservices.associations.AssociationListPage
import com.hubspot_sdk.api.models.crm.objects.partnerservices.associations.AssociationListParams
import com.hubspot_sdk.api.models.crm.objects.partnerservices.associations.AssociationUpdateParams
import java.util.function.Consumer

interface AssociationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationService

    /** Associate a partner service with another object */
    fun update(
        associationType: String,
        params: AssociationUpdateParams,
    ): SimplePublicObjectWithAssociations = update(associationType, params, RequestOptions.none())

    /** @see update */
    fun update(
        associationType: String,
        params: AssociationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        update(params.toBuilder().associationType(associationType).build(), requestOptions)

    /** @see update */
    fun update(params: AssociationUpdateParams): SimplePublicObjectWithAssociations =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AssociationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** List associations of a partner service by type */
    fun list(toObjectType: String, params: AssociationListParams): AssociationListPage =
        list(toObjectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        toObjectType: String,
        params: AssociationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociationListPage =
        list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see list */
    fun list(params: AssociationListParams): AssociationListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AssociationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociationListPage

    /** Remove an association between two partner services */
    fun delete(associationType: String, params: AssociationDeleteParams) =
        delete(associationType, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        associationType: String,
        params: AssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().associationType(associationType).build(), requestOptions)

    /** @see delete */
    fun delete(params: AssociationDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [AssociationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /crm/v3/objects/partner_services/{partnerServiceId}/associations/{toObjectType}/{toObjectId}/{associationType}`,
         * but is otherwise the same as [AssociationService.update].
         */
        @MustBeClosed
        fun update(
            associationType: String,
            params: AssociationUpdateParams,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            update(associationType, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            associationType: String,
            params: AssociationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            update(params.toBuilder().associationType(associationType).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: AssociationUpdateParams
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AssociationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/objects/partner_services/{partnerServiceId}/associations/{toObjectType}`, but is
         * otherwise the same as [AssociationService.list].
         */
        @MustBeClosed
        fun list(
            toObjectType: String,
            params: AssociationListParams,
        ): HttpResponseFor<AssociationListPage> = list(toObjectType, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            toObjectType: String,
            params: AssociationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociationListPage> =
            list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: AssociationListParams): HttpResponseFor<AssociationListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AssociationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociationListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/v3/objects/partner_services/{partnerServiceId}/associations/{toObjectType}/{toObjectId}/{associationType}`,
         * but is otherwise the same as [AssociationService.delete].
         */
        @MustBeClosed
        fun delete(associationType: String, params: AssociationDeleteParams): HttpResponse =
            delete(associationType, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            associationType: String,
            params: AssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().associationType(associationType).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: AssociationDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
