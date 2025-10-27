// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceGetParams
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceListPage
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceListParams
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceSearchParams
import com.hubspot_sdk.api.models.crm.objects.partnerservices.PartnerServiceUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.partnerservices.AssociationService
import com.hubspot_sdk.api.services.blocking.crm.objects.partnerservices.BatchService
import java.util.function.Consumer

interface PartnerServiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PartnerServiceService

    fun associations(): AssociationService

    fun batch(): BatchService

    /**
     * Perform a partial update of an Object identified by `{partnerServiceId}`or optionally a
     * unique property value as specified by the `idProperty` query param. `{partnerServiceId}`
     * refers to the internal object ID by default, and the `idProperty` query param refers to a
     * property whose values are unique for the object. Provided property values will be
     * overwritten. Read-only and non-existent properties will result in an error. Properties values
     * can be cleared by passing an empty string.
     */
    fun update(partnerServiceId: String, params: PartnerServiceUpdateParams): SimplePublicObject =
        update(partnerServiceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        partnerServiceId: String,
        params: PartnerServiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        update(params.toBuilder().partnerServiceId(partnerServiceId).build(), requestOptions)

    /** @see update */
    fun update(params: PartnerServiceUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PartnerServiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /**
     * Read a page of partner services. Control what is returned via the `properties` query param.
     */
    fun list(): PartnerServiceListPage = list(PartnerServiceListParams.none())

    /** @see list */
    fun list(
        params: PartnerServiceListParams = PartnerServiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PartnerServiceListPage

    /** @see list */
    fun list(
        params: PartnerServiceListParams = PartnerServiceListParams.none()
    ): PartnerServiceListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PartnerServiceListPage =
        list(PartnerServiceListParams.none(), requestOptions)

    /**
     * Read an Object identified by `{partnerServiceId}`. `{partnerServiceId}` refers to the
     * internal object ID by default, or optionally any unique property value as specified by the
     * `idProperty` query param. Control what is returned via the `properties` query param.
     */
    fun get(partnerServiceId: String): SimplePublicObjectWithAssociations =
        get(partnerServiceId, PartnerServiceGetParams.none())

    /** @see get */
    fun get(
        partnerServiceId: String,
        params: PartnerServiceGetParams = PartnerServiceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().partnerServiceId(partnerServiceId).build(), requestOptions)

    /** @see get */
    fun get(
        partnerServiceId: String,
        params: PartnerServiceGetParams = PartnerServiceGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(partnerServiceId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PartnerServiceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: PartnerServiceGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        partnerServiceId: String,
        requestOptions: RequestOptions,
    ): SimplePublicObjectWithAssociations =
        get(partnerServiceId, PartnerServiceGetParams.none(), requestOptions)

    fun search(params: PartnerServiceSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: PartnerServiceSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            PartnerServiceSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /**
     * A view of [PartnerServiceService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PartnerServiceService.WithRawResponse

        fun associations(): AssociationService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch
         * /crm/v3/objects/partner_services/{partnerServiceId}`, but is otherwise the same as
         * [PartnerServiceService.update].
         */
        @MustBeClosed
        fun update(
            partnerServiceId: String,
            params: PartnerServiceUpdateParams,
        ): HttpResponseFor<SimplePublicObject> =
            update(partnerServiceId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            partnerServiceId: String,
            params: PartnerServiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().partnerServiceId(partnerServiceId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: PartnerServiceUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PartnerServiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/partner_services`, but is otherwise
         * the same as [PartnerServiceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PartnerServiceListPage> = list(PartnerServiceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PartnerServiceListParams = PartnerServiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PartnerServiceListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PartnerServiceListParams = PartnerServiceListParams.none()
        ): HttpResponseFor<PartnerServiceListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PartnerServiceListPage> =
            list(PartnerServiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/objects/partner_services/{partnerServiceId}`, but is otherwise the same as
         * [PartnerServiceService.get].
         */
        @MustBeClosed
        fun get(partnerServiceId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(partnerServiceId, PartnerServiceGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            partnerServiceId: String,
            params: PartnerServiceGetParams = PartnerServiceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().partnerServiceId(partnerServiceId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            partnerServiceId: String,
            params: PartnerServiceGetParams = PartnerServiceGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(partnerServiceId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PartnerServiceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(
            params: PartnerServiceGetParams
        ): HttpResponseFor<SimplePublicObjectWithAssociations> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            partnerServiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(partnerServiceId, PartnerServiceGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/partner_services/search`, but is
         * otherwise the same as [PartnerServiceService.search].
         */
        @MustBeClosed
        fun search(
            params: PartnerServiceSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: PartnerServiceSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                PartnerServiceSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
