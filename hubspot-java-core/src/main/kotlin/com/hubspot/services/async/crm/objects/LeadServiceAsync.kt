// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm.objects

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.models.crm.PublicObjectSearchRequest
import com.hubspot.models.crm.SimplePublicObject
import com.hubspot.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.models.crm.objects.leads.LeadCreateParams
import com.hubspot.models.crm.objects.leads.LeadDeleteParams
import com.hubspot.models.crm.objects.leads.LeadGetParams
import com.hubspot.models.crm.objects.leads.LeadListPageAsync
import com.hubspot.models.crm.objects.leads.LeadListParams
import com.hubspot.models.crm.objects.leads.LeadSearchParams
import com.hubspot.models.crm.objects.leads.LeadUpdateParams
import com.hubspot.services.async.crm.objects.leads.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LeadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LeadServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a lead with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard leads is provided.
     */
    fun create(params: LeadCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LeadCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            LeadCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CompletableFuture<SimplePublicObject> =
        create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{leadsId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{leadsId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(leadsId: String, params: LeadUpdateParams): CompletableFuture<SimplePublicObject> =
        update(leadsId, params, RequestOptions.none())

    /** @see update */
    fun update(
        leadsId: String,
        params: LeadUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().leadsId(leadsId).build(), requestOptions)

    /** @see update */
    fun update(params: LeadUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LeadUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of leads. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<LeadListPageAsync> = list(LeadListParams.none())

    /** @see list */
    fun list(
        params: LeadListParams = LeadListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LeadListPageAsync>

    /** @see list */
    fun list(params: LeadListParams = LeadListParams.none()): CompletableFuture<LeadListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LeadListPageAsync> =
        list(LeadListParams.none(), requestOptions)

    /** Move an Object identified by `{leadsId}` to the recycling bin. */
    fun delete(leadsId: String): CompletableFuture<Void?> = delete(leadsId, LeadDeleteParams.none())

    /** @see delete */
    fun delete(
        leadsId: String,
        params: LeadDeleteParams = LeadDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().leadsId(leadsId).build(), requestOptions)

    /** @see delete */
    fun delete(
        leadsId: String,
        params: LeadDeleteParams = LeadDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(leadsId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LeadDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: LeadDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(leadsId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(leadsId, LeadDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{leadsId}`. `{leadsId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(leadsId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(leadsId, LeadGetParams.none())

    /** @see get */
    fun get(
        leadsId: String,
        params: LeadGetParams = LeadGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().leadsId(leadsId).build(), requestOptions)

    /** @see get */
    fun get(
        leadsId: String,
        params: LeadGetParams = LeadGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(leadsId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LeadGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: LeadGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        leadsId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(leadsId, LeadGetParams.none(), requestOptions)

    /**
     * Perform a search for leads based on the provided filter groups, properties, and sorting
     * options. The request allows for pagination and can return up to 200 results per page.
     */
    fun search(
        params: LeadSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: LeadSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            LeadSearchParams.builder().publicObjectSearchRequest(publicObjectSearchRequest).build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [LeadServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LeadServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/leads`, but is otherwise the
         * same as [LeadServiceAsync.create].
         */
        fun create(
            params: LeadCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LeadCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                LeadCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/leads/{leadsId}`, but is
         * otherwise the same as [LeadServiceAsync.update].
         */
        fun update(
            leadsId: String,
            params: LeadUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(leadsId, params, RequestOptions.none())

        /** @see update */
        fun update(
            leadsId: String,
            params: LeadUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().leadsId(leadsId).build(), requestOptions)

        /** @see update */
        fun update(
            params: LeadUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LeadUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/leads`, but is otherwise the
         * same as [LeadServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LeadListPageAsync>> =
            list(LeadListParams.none())

        /** @see list */
        fun list(
            params: LeadListParams = LeadListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LeadListPageAsync>>

        /** @see list */
        fun list(
            params: LeadListParams = LeadListParams.none()
        ): CompletableFuture<HttpResponseFor<LeadListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LeadListPageAsync>> =
            list(LeadListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/leads/{leadsId}`, but is
         * otherwise the same as [LeadServiceAsync.delete].
         */
        fun delete(leadsId: String): CompletableFuture<HttpResponse> =
            delete(leadsId, LeadDeleteParams.none())

        /** @see delete */
        fun delete(
            leadsId: String,
            params: LeadDeleteParams = LeadDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().leadsId(leadsId).build(), requestOptions)

        /** @see delete */
        fun delete(
            leadsId: String,
            params: LeadDeleteParams = LeadDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(leadsId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LeadDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: LeadDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            leadsId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(leadsId, LeadDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/leads/{leadsId}`, but is
         * otherwise the same as [LeadServiceAsync.get].
         */
        fun get(
            leadsId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(leadsId, LeadGetParams.none())

        /** @see get */
        fun get(
            leadsId: String,
            params: LeadGetParams = LeadGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().leadsId(leadsId).build(), requestOptions)

        /** @see get */
        fun get(
            leadsId: String,
            params: LeadGetParams = LeadGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(leadsId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: LeadGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: LeadGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            leadsId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(leadsId, LeadGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/leads/search`, but is
         * otherwise the same as [LeadServiceAsync.search].
         */
        fun search(
            params: LeadSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: LeadSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                LeadSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
