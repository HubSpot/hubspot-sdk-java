// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.sdk.models.crm.PublicObjectSearchRequest
import com.hubspot.sdk.models.crm.SimplePublicObject
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.sdk.models.crm.objects.leads.LeadCreateParams
import com.hubspot.sdk.models.crm.objects.leads.LeadDeleteParams
import com.hubspot.sdk.models.crm.objects.leads.LeadGetParams
import com.hubspot.sdk.models.crm.objects.leads.LeadListPage
import com.hubspot.sdk.models.crm.objects.leads.LeadListParams
import com.hubspot.sdk.models.crm.objects.leads.LeadSearchParams
import com.hubspot.sdk.models.crm.objects.leads.LeadUpdateParams
import com.hubspot.sdk.services.blocking.crm.objects.leads.BatchService
import java.util.function.Consumer

interface LeadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LeadService

    fun batch(): BatchService

    /**
     * Create a lead with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard leads is provided.
     */
    fun create(params: LeadCreateParams): SimplePublicObject = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LeadCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            LeadCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{leadsId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{leadsId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(leadsId: String, params: LeadUpdateParams): SimplePublicObject =
        update(leadsId, params, RequestOptions.none())

    /** @see update */
    fun update(
        leadsId: String,
        params: LeadUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().leadsId(leadsId).build(), requestOptions)

    /** @see update */
    fun update(params: LeadUpdateParams): SimplePublicObject = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LeadUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of leads. Control what is returned via the `properties` query param. */
    fun list(): LeadListPage = list(LeadListParams.none())

    /** @see list */
    fun list(
        params: LeadListParams = LeadListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LeadListPage

    /** @see list */
    fun list(params: LeadListParams = LeadListParams.none()): LeadListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): LeadListPage =
        list(LeadListParams.none(), requestOptions)

    /** Move an Object identified by `{leadsId}` to the recycling bin. */
    fun delete(leadsId: String) = delete(leadsId, LeadDeleteParams.none())

    /** @see delete */
    fun delete(
        leadsId: String,
        params: LeadDeleteParams = LeadDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().leadsId(leadsId).build(), requestOptions)

    /** @see delete */
    fun delete(leadsId: String, params: LeadDeleteParams = LeadDeleteParams.none()) =
        delete(leadsId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: LeadDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: LeadDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(leadsId: String, requestOptions: RequestOptions) =
        delete(leadsId, LeadDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{leadsId}`. `{leadsId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(leadsId: String): SimplePublicObjectWithAssociations =
        get(leadsId, LeadGetParams.none())

    /** @see get */
    fun get(
        leadsId: String,
        params: LeadGetParams = LeadGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().leadsId(leadsId).build(), requestOptions)

    /** @see get */
    fun get(
        leadsId: String,
        params: LeadGetParams = LeadGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(leadsId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LeadGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: LeadGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(leadsId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(leadsId, LeadGetParams.none(), requestOptions)

    /**
     * Perform a search for leads based on the provided filter groups, properties, and sorting
     * options. The request allows for pagination and can return up to 200 results per page.
     */
    fun search(params: LeadSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: LeadSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            LeadSearchParams.builder().publicObjectSearchRequest(publicObjectSearchRequest).build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [LeadService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LeadService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/leads`, but is otherwise the
         * same as [LeadService.create].
         */
        @MustBeClosed
        fun create(params: LeadCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LeadCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                LeadCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): HttpResponseFor<SimplePublicObject> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/leads/{leadsId}`, but is
         * otherwise the same as [LeadService.update].
         */
        @MustBeClosed
        fun update(leadsId: String, params: LeadUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(leadsId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            leadsId: String,
            params: LeadUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().leadsId(leadsId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: LeadUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: LeadUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/leads`, but is otherwise the
         * same as [LeadService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<LeadListPage> = list(LeadListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LeadListParams = LeadListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LeadListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: LeadListParams = LeadListParams.none()): HttpResponseFor<LeadListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LeadListPage> =
            list(LeadListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/leads/{leadsId}`, but is
         * otherwise the same as [LeadService.delete].
         */
        @MustBeClosed
        fun delete(leadsId: String): HttpResponse = delete(leadsId, LeadDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            leadsId: String,
            params: LeadDeleteParams = LeadDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().leadsId(leadsId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            leadsId: String,
            params: LeadDeleteParams = LeadDeleteParams.none(),
        ): HttpResponse = delete(leadsId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LeadDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: LeadDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(leadsId: String, requestOptions: RequestOptions): HttpResponse =
            delete(leadsId, LeadDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/leads/{leadsId}`, but is
         * otherwise the same as [LeadService.get].
         */
        @MustBeClosed
        fun get(leadsId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(leadsId, LeadGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            leadsId: String,
            params: LeadGetParams = LeadGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().leadsId(leadsId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            leadsId: String,
            params: LeadGetParams = LeadGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(leadsId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: LeadGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: LeadGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            leadsId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(leadsId, LeadGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/leads/search`, but is
         * otherwise the same as [LeadService.search].
         */
        @MustBeClosed
        fun search(
            params: LeadSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: LeadSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                LeadSearchParams.builder()
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
