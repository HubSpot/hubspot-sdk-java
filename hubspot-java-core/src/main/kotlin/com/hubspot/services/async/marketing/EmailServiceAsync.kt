// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.marketing

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.AbTestCreateRequestVNext
import com.hubspot.models.marketing.emails.AggregateEmailStatistics
import com.hubspot.models.marketing.emails.CollectionResponseWithTotalEmailStatisticInterval
import com.hubspot.models.marketing.emails.EmailCloneParams
import com.hubspot.models.marketing.emails.EmailCloneRequestVNext
import com.hubspot.models.marketing.emails.EmailCreateAbTestVariationParams
import com.hubspot.models.marketing.emails.EmailCreateParams
import com.hubspot.models.marketing.emails.EmailCreateRequest
import com.hubspot.models.marketing.emails.EmailDeleteParams
import com.hubspot.models.marketing.emails.EmailGetAbTestVariationParams
import com.hubspot.models.marketing.emails.EmailGetDraftParams
import com.hubspot.models.marketing.emails.EmailGetHistogramParams
import com.hubspot.models.marketing.emails.EmailGetParams
import com.hubspot.models.marketing.emails.EmailGetRevisionParams
import com.hubspot.models.marketing.emails.EmailListPageAsync
import com.hubspot.models.marketing.emails.EmailListParams
import com.hubspot.models.marketing.emails.EmailListRevisionsPageAsync
import com.hubspot.models.marketing.emails.EmailListRevisionsParams
import com.hubspot.models.marketing.emails.EmailPublishParams
import com.hubspot.models.marketing.emails.EmailResetDraftParams
import com.hubspot.models.marketing.emails.EmailRestoreRevisionParams
import com.hubspot.models.marketing.emails.EmailRestoreRevisionToDraftParams
import com.hubspot.models.marketing.emails.EmailUnpublishParams
import com.hubspot.models.marketing.emails.EmailUpdateDraftParams
import com.hubspot.models.marketing.emails.EmailUpdateParams
import com.hubspot.models.marketing.emails.PublicEmail
import com.hubspot.models.marketing.emails.PublicEmailVersion
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EmailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailServiceAsync

    fun create(params: EmailCreateParams): CompletableFuture<PublicEmail> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicEmail>

    /** @see create */
    fun create(
        emailCreateRequest: EmailCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicEmail> =
        create(
            EmailCreateParams.builder().emailCreateRequest(emailCreateRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(emailCreateRequest: EmailCreateRequest): CompletableFuture<PublicEmail> =
        create(emailCreateRequest, RequestOptions.none())

    /** Change properties of a marketing email. */
    fun update(emailId: String, params: EmailUpdateParams): CompletableFuture<PublicEmail> =
        update(emailId, params, RequestOptions.none())

    /** @see update */
    fun update(
        emailId: String,
        params: EmailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicEmail> =
        update(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see update */
    fun update(params: EmailUpdateParams): CompletableFuture<PublicEmail> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EmailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicEmail>

    fun list(): CompletableFuture<EmailListPageAsync> = list(EmailListParams.none())

    /** @see list */
    fun list(
        params: EmailListParams = EmailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailListPageAsync>

    /** @see list */
    fun list(
        params: EmailListParams = EmailListParams.none()
    ): CompletableFuture<EmailListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EmailListPageAsync> =
        list(EmailListParams.none(), requestOptions)

    /** Delete a marketing email by its ID */
    fun delete(emailId: String): CompletableFuture<Void?> =
        delete(emailId, EmailDeleteParams.none())

    /** @see delete */
    fun delete(
        emailId: String,
        params: EmailDeleteParams = EmailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see delete */
    fun delete(
        emailId: String,
        params: EmailDeleteParams = EmailDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(emailId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EmailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EmailDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(emailId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(emailId, EmailDeleteParams.none(), requestOptions)

    /**
     * This will create a duplicate email with the same properties as the original, with the
     * exception of a unique ID.
     */
    fun clone(params: EmailCloneParams): CompletableFuture<PublicEmail> =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: EmailCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicEmail>

    /** @see clone */
    fun clone(
        emailCloneRequestVNext: EmailCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicEmail> =
        clone(
            EmailCloneParams.builder().emailCloneRequestVNext(emailCloneRequestVNext).build(),
            requestOptions,
        )

    /** @see clone */
    fun clone(emailCloneRequestVNext: EmailCloneRequestVNext): CompletableFuture<PublicEmail> =
        clone(emailCloneRequestVNext, RequestOptions.none())

    /**
     * Create a variation of a marketing email for an A/B test. The new variation will be created as
     * a draft. If an active variation already exists, a new one won't be created.
     */
    fun createAbTestVariation(
        params: EmailCreateAbTestVariationParams
    ): CompletableFuture<PublicEmail> = createAbTestVariation(params, RequestOptions.none())

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        params: EmailCreateAbTestVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicEmail>

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicEmail> =
        createAbTestVariation(
            EmailCreateAbTestVariationParams.builder()
                .abTestCreateRequestVNext(abTestCreateRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext
    ): CompletableFuture<PublicEmail> =
        createAbTestVariation(abTestCreateRequestVNext, RequestOptions.none())

    /**
     * Use this endpoint to get aggregated statistics of emails sent in a specified time span. It
     * also returns the list of emails that were sent during the time span.
     */
    fun get(): CompletableFuture<AggregateEmailStatistics> = get(EmailGetParams.none())

    /** @see get */
    fun get(
        params: EmailGetParams = EmailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregateEmailStatistics>

    /** @see get */
    fun get(
        params: EmailGetParams = EmailGetParams.none()
    ): CompletableFuture<AggregateEmailStatistics> = get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): CompletableFuture<AggregateEmailStatistics> =
        get(EmailGetParams.none(), requestOptions)

    /**
     * This endpoint lets you obtain the variation of an A/B marketing email. If the email is
     * variation A (master) it will return variation B (variant) and vice versa.
     */
    fun getAbTestVariation(emailId: String): CompletableFuture<PublicEmail> =
        getAbTestVariation(emailId, EmailGetAbTestVariationParams.none())

    /** @see getAbTestVariation */
    fun getAbTestVariation(
        emailId: String,
        params: EmailGetAbTestVariationParams = EmailGetAbTestVariationParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicEmail> =
        getAbTestVariation(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see getAbTestVariation */
    fun getAbTestVariation(
        emailId: String,
        params: EmailGetAbTestVariationParams = EmailGetAbTestVariationParams.none(),
    ): CompletableFuture<PublicEmail> = getAbTestVariation(emailId, params, RequestOptions.none())

    /** @see getAbTestVariation */
    fun getAbTestVariation(
        params: EmailGetAbTestVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicEmail>

    /** @see getAbTestVariation */
    fun getAbTestVariation(params: EmailGetAbTestVariationParams): CompletableFuture<PublicEmail> =
        getAbTestVariation(params, RequestOptions.none())

    /** @see getAbTestVariation */
    fun getAbTestVariation(
        emailId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmail> =
        getAbTestVariation(emailId, EmailGetAbTestVariationParams.none(), requestOptions)

    /**
     * Get the draft version of an email (if it exists). If no draft version exists, the published
     * email is returned.
     */
    fun getDraft(emailId: String): CompletableFuture<PublicEmail> =
        getDraft(emailId, EmailGetDraftParams.none())

    /** @see getDraft */
    fun getDraft(
        emailId: String,
        params: EmailGetDraftParams = EmailGetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicEmail> =
        getDraft(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see getDraft */
    fun getDraft(
        emailId: String,
        params: EmailGetDraftParams = EmailGetDraftParams.none(),
    ): CompletableFuture<PublicEmail> = getDraft(emailId, params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        params: EmailGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicEmail>

    /** @see getDraft */
    fun getDraft(params: EmailGetDraftParams): CompletableFuture<PublicEmail> =
        getDraft(params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(emailId: String, requestOptions: RequestOptions): CompletableFuture<PublicEmail> =
        getDraft(emailId, EmailGetDraftParams.none(), requestOptions)

    /**
     * Get aggregated statistics in intervals for a specified time span. Each interval contains
     * aggregated statistics of the emails that were sent in that time.
     */
    fun getHistogram(): CompletableFuture<CollectionResponseWithTotalEmailStatisticInterval> =
        getHistogram(EmailGetHistogramParams.none())

    /** @see getHistogram */
    fun getHistogram(
        params: EmailGetHistogramParams = EmailGetHistogramParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalEmailStatisticInterval>

    /** @see getHistogram */
    fun getHistogram(
        params: EmailGetHistogramParams = EmailGetHistogramParams.none()
    ): CompletableFuture<CollectionResponseWithTotalEmailStatisticInterval> =
        getHistogram(params, RequestOptions.none())

    /** @see getHistogram */
    fun getHistogram(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponseWithTotalEmailStatisticInterval> =
        getHistogram(EmailGetHistogramParams.none(), requestOptions)

    /** Get a specific revision of a marketing email. */
    fun getRevision(
        revisionId: String,
        params: EmailGetRevisionParams,
    ): CompletableFuture<PublicEmailVersion> =
        getRevision(revisionId, params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        revisionId: String,
        params: EmailGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicEmailVersion> =
        getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getRevision */
    fun getRevision(params: EmailGetRevisionParams): CompletableFuture<PublicEmailVersion> =
        getRevision(params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        params: EmailGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicEmailVersion>

    /**
     * Get a list of all versions of a marketing email, with each entry including the full state of
     * that particular version. To view the most recent version, sort by the updatedAt parameter.
     */
    fun listRevisions(emailId: String): CompletableFuture<EmailListRevisionsPageAsync> =
        listRevisions(emailId, EmailListRevisionsParams.none())

    /** @see listRevisions */
    fun listRevisions(
        emailId: String,
        params: EmailListRevisionsParams = EmailListRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailListRevisionsPageAsync> =
        listRevisions(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see listRevisions */
    fun listRevisions(
        emailId: String,
        params: EmailListRevisionsParams = EmailListRevisionsParams.none(),
    ): CompletableFuture<EmailListRevisionsPageAsync> =
        listRevisions(emailId, params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        params: EmailListRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailListRevisionsPageAsync>

    /** @see listRevisions */
    fun listRevisions(
        params: EmailListRevisionsParams
    ): CompletableFuture<EmailListRevisionsPageAsync> = listRevisions(params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        emailId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailListRevisionsPageAsync> =
        listRevisions(emailId, EmailListRevisionsParams.none(), requestOptions)

    /**
     * If you have a Marketing Hub Enterprise account or the transactional email add-on, you can use
     * this endpoint to publish an automated email or send/schedule a regular email.
     */
    fun publish(emailId: String): CompletableFuture<Void?> =
        publish(emailId, EmailPublishParams.none())

    /** @see publish */
    fun publish(
        emailId: String,
        params: EmailPublishParams = EmailPublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        publish(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see publish */
    fun publish(
        emailId: String,
        params: EmailPublishParams = EmailPublishParams.none(),
    ): CompletableFuture<Void?> = publish(emailId, params, RequestOptions.none())

    /** @see publish */
    fun publish(
        params: EmailPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see publish */
    fun publish(params: EmailPublishParams): CompletableFuture<Void?> =
        publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(emailId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        publish(emailId, EmailPublishParams.none(), requestOptions)

    /** Resets the draft back to a copy of the live object. */
    fun resetDraft(emailId: String): CompletableFuture<Void?> =
        resetDraft(emailId, EmailResetDraftParams.none())

    /** @see resetDraft */
    fun resetDraft(
        emailId: String,
        params: EmailResetDraftParams = EmailResetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        resetDraft(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see resetDraft */
    fun resetDraft(
        emailId: String,
        params: EmailResetDraftParams = EmailResetDraftParams.none(),
    ): CompletableFuture<Void?> = resetDraft(emailId, params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(
        params: EmailResetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see resetDraft */
    fun resetDraft(params: EmailResetDraftParams): CompletableFuture<Void?> =
        resetDraft(params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(emailId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        resetDraft(emailId, EmailResetDraftParams.none(), requestOptions)

    /**
     * Restores a previous revision of a marketing email. The current revision becomes old, and the
     * restored revision is given a new version number.
     */
    fun restoreRevision(
        revisionId: String,
        params: EmailRestoreRevisionParams,
    ): CompletableFuture<Void?> = restoreRevision(revisionId, params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        revisionId: String,
        params: EmailRestoreRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreRevision */
    fun restoreRevision(params: EmailRestoreRevisionParams): CompletableFuture<Void?> =
        restoreRevision(params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        params: EmailRestoreRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Restores a previous revision of a marketing email to DRAFT state. If there is currently
     * something in the draft for that object, it is overwritten.
     */
    fun restoreRevisionToDraft(
        revisionId: Long,
        params: EmailRestoreRevisionToDraftParams,
    ): CompletableFuture<PublicEmail> =
        restoreRevisionToDraft(revisionId, params, RequestOptions.none())

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        revisionId: Long,
        params: EmailRestoreRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicEmail> =
        restoreRevisionToDraft(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        params: EmailRestoreRevisionToDraftParams
    ): CompletableFuture<PublicEmail> = restoreRevisionToDraft(params, RequestOptions.none())

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        params: EmailRestoreRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicEmail>

    /**
     * If you have a Marketing Hub Enterprise account or the transactional email add-on, you can use
     * this endpoint to unpublish an automated email or cancel a regular email. If the email is
     * already in the process of being sent, canceling might not be possible.
     */
    fun unpublish(emailId: String): CompletableFuture<Void?> =
        unpublish(emailId, EmailUnpublishParams.none())

    /** @see unpublish */
    fun unpublish(
        emailId: String,
        params: EmailUnpublishParams = EmailUnpublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        unpublish(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see unpublish */
    fun unpublish(
        emailId: String,
        params: EmailUnpublishParams = EmailUnpublishParams.none(),
    ): CompletableFuture<Void?> = unpublish(emailId, params, RequestOptions.none())

    /** @see unpublish */
    fun unpublish(
        params: EmailUnpublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see unpublish */
    fun unpublish(params: EmailUnpublishParams): CompletableFuture<Void?> =
        unpublish(params, RequestOptions.none())

    /** @see unpublish */
    fun unpublish(emailId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        unpublish(emailId, EmailUnpublishParams.none(), requestOptions)

    /**
     * Create or update the draft version of a marketing email. If no draft exists, the system
     * creates a draft from the current “live” email then applies the request body to that draft.
     * The draft version only lives on the buffer—the email is not cloned.
     */
    fun updateDraft(
        emailId: String,
        params: EmailUpdateDraftParams,
    ): CompletableFuture<PublicEmail> = updateDraft(emailId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        emailId: String,
        params: EmailUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicEmail> =
        updateDraft(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: EmailUpdateDraftParams): CompletableFuture<PublicEmail> =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: EmailUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicEmail>

    /** A view of [EmailServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /marketing/emails/2026-03`, but is otherwise the
         * same as [EmailServiceAsync.create].
         */
        fun create(params: EmailCreateParams): CompletableFuture<HttpResponseFor<PublicEmail>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EmailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmail>>

        /** @see create */
        fun create(
            emailCreateRequest: EmailCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            create(
                EmailCreateParams.builder().emailCreateRequest(emailCreateRequest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            emailCreateRequest: EmailCreateRequest
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            create(emailCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /marketing/emails/2026-03/{emailId}`, but is
         * otherwise the same as [EmailServiceAsync.update].
         */
        fun update(
            emailId: String,
            params: EmailUpdateParams,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            update(emailId, params, RequestOptions.none())

        /** @see update */
        fun update(
            emailId: String,
            params: EmailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            update(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see update */
        fun update(params: EmailUpdateParams): CompletableFuture<HttpResponseFor<PublicEmail>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EmailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmail>>

        /**
         * Returns a raw HTTP response for `get /marketing/emails/2026-03`, but is otherwise the
         * same as [EmailServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EmailListPageAsync>> =
            list(EmailListParams.none())

        /** @see list */
        fun list(
            params: EmailListParams = EmailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailListPageAsync>>

        /** @see list */
        fun list(
            params: EmailListParams = EmailListParams.none()
        ): CompletableFuture<HttpResponseFor<EmailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EmailListPageAsync>> =
            list(EmailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /marketing/emails/2026-03/{emailId}`, but is
         * otherwise the same as [EmailServiceAsync.delete].
         */
        fun delete(emailId: String): CompletableFuture<HttpResponse> =
            delete(emailId, EmailDeleteParams.none())

        /** @see delete */
        fun delete(
            emailId: String,
            params: EmailDeleteParams = EmailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see delete */
        fun delete(
            emailId: String,
            params: EmailDeleteParams = EmailDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(emailId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EmailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EmailDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            emailId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(emailId, EmailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /marketing/emails/2026-03/clone`, but is otherwise
         * the same as [EmailServiceAsync.clone].
         */
        fun clone(params: EmailCloneParams): CompletableFuture<HttpResponseFor<PublicEmail>> =
            clone(params, RequestOptions.none())

        /** @see clone */
        fun clone(
            params: EmailCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmail>>

        /** @see clone */
        fun clone(
            emailCloneRequestVNext: EmailCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            clone(
                EmailCloneParams.builder().emailCloneRequestVNext(emailCloneRequestVNext).build(),
                requestOptions,
            )

        /** @see clone */
        fun clone(
            emailCloneRequestVNext: EmailCloneRequestVNext
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            clone(emailCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /marketing/emails/2026-03/ab-test/create-variation`, but is otherwise the same as
         * [EmailServiceAsync.createAbTestVariation].
         */
        fun createAbTestVariation(
            params: EmailCreateAbTestVariationParams
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            createAbTestVariation(params, RequestOptions.none())

        /** @see createAbTestVariation */
        fun createAbTestVariation(
            params: EmailCreateAbTestVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmail>>

        /** @see createAbTestVariation */
        fun createAbTestVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            createAbTestVariation(
                EmailCreateAbTestVariationParams.builder()
                    .abTestCreateRequestVNext(abTestCreateRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createAbTestVariation */
        fun createAbTestVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            createAbTestVariation(abTestCreateRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /marketing/emails/2026-03/statistics/list`, but is
         * otherwise the same as [EmailServiceAsync.get].
         */
        fun get(): CompletableFuture<HttpResponseFor<AggregateEmailStatistics>> =
            get(EmailGetParams.none())

        /** @see get */
        fun get(
            params: EmailGetParams = EmailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregateEmailStatistics>>

        /** @see get */
        fun get(
            params: EmailGetParams = EmailGetParams.none()
        ): CompletableFuture<HttpResponseFor<AggregateEmailStatistics>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AggregateEmailStatistics>> =
            get(EmailGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /marketing/emails/2026-03/{emailId}/ab-test/get-variation`, but is otherwise the same as
         * [EmailServiceAsync.getAbTestVariation].
         */
        fun getAbTestVariation(emailId: String): CompletableFuture<HttpResponseFor<PublicEmail>> =
            getAbTestVariation(emailId, EmailGetAbTestVariationParams.none())

        /** @see getAbTestVariation */
        fun getAbTestVariation(
            emailId: String,
            params: EmailGetAbTestVariationParams = EmailGetAbTestVariationParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            getAbTestVariation(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see getAbTestVariation */
        fun getAbTestVariation(
            emailId: String,
            params: EmailGetAbTestVariationParams = EmailGetAbTestVariationParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            getAbTestVariation(emailId, params, RequestOptions.none())

        /** @see getAbTestVariation */
        fun getAbTestVariation(
            params: EmailGetAbTestVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmail>>

        /** @see getAbTestVariation */
        fun getAbTestVariation(
            params: EmailGetAbTestVariationParams
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            getAbTestVariation(params, RequestOptions.none())

        /** @see getAbTestVariation */
        fun getAbTestVariation(
            emailId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            getAbTestVariation(emailId, EmailGetAbTestVariationParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /marketing/emails/2026-03/{emailId}/draft`, but is
         * otherwise the same as [EmailServiceAsync.getDraft].
         */
        fun getDraft(emailId: String): CompletableFuture<HttpResponseFor<PublicEmail>> =
            getDraft(emailId, EmailGetDraftParams.none())

        /** @see getDraft */
        fun getDraft(
            emailId: String,
            params: EmailGetDraftParams = EmailGetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            getDraft(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see getDraft */
        fun getDraft(
            emailId: String,
            params: EmailGetDraftParams = EmailGetDraftParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            getDraft(emailId, params, RequestOptions.none())

        /** @see getDraft */
        fun getDraft(
            params: EmailGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmail>>

        /** @see getDraft */
        fun getDraft(params: EmailGetDraftParams): CompletableFuture<HttpResponseFor<PublicEmail>> =
            getDraft(params, RequestOptions.none())

        /** @see getDraft */
        fun getDraft(
            emailId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            getDraft(emailId, EmailGetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /marketing/emails/2026-03/statistics/histogram`, but
         * is otherwise the same as [EmailServiceAsync.getHistogram].
         */
        fun getHistogram():
            CompletableFuture<HttpResponseFor<CollectionResponseWithTotalEmailStatisticInterval>> =
            getHistogram(EmailGetHistogramParams.none())

        /** @see getHistogram */
        fun getHistogram(
            params: EmailGetHistogramParams = EmailGetHistogramParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalEmailStatisticInterval>>

        /** @see getHistogram */
        fun getHistogram(
            params: EmailGetHistogramParams = EmailGetHistogramParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalEmailStatisticInterval>> =
            getHistogram(params, RequestOptions.none())

        /** @see getHistogram */
        fun getHistogram(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalEmailStatisticInterval>> =
            getHistogram(EmailGetHistogramParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /marketing/emails/2026-03/{emailId}/revisions/{revisionId}`, but is otherwise the same as
         * [EmailServiceAsync.getRevision].
         */
        fun getRevision(
            revisionId: String,
            params: EmailGetRevisionParams,
        ): CompletableFuture<HttpResponseFor<PublicEmailVersion>> =
            getRevision(revisionId, params, RequestOptions.none())

        /** @see getRevision */
        fun getRevision(
            revisionId: String,
            params: EmailGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmailVersion>> =
            getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getRevision */
        fun getRevision(
            params: EmailGetRevisionParams
        ): CompletableFuture<HttpResponseFor<PublicEmailVersion>> =
            getRevision(params, RequestOptions.none())

        /** @see getRevision */
        fun getRevision(
            params: EmailGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmailVersion>>

        /**
         * Returns a raw HTTP response for `get /marketing/emails/2026-03/{emailId}/revisions`, but
         * is otherwise the same as [EmailServiceAsync.listRevisions].
         */
        fun listRevisions(
            emailId: String
        ): CompletableFuture<HttpResponseFor<EmailListRevisionsPageAsync>> =
            listRevisions(emailId, EmailListRevisionsParams.none())

        /** @see listRevisions */
        fun listRevisions(
            emailId: String,
            params: EmailListRevisionsParams = EmailListRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailListRevisionsPageAsync>> =
            listRevisions(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see listRevisions */
        fun listRevisions(
            emailId: String,
            params: EmailListRevisionsParams = EmailListRevisionsParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailListRevisionsPageAsync>> =
            listRevisions(emailId, params, RequestOptions.none())

        /** @see listRevisions */
        fun listRevisions(
            params: EmailListRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailListRevisionsPageAsync>>

        /** @see listRevisions */
        fun listRevisions(
            params: EmailListRevisionsParams
        ): CompletableFuture<HttpResponseFor<EmailListRevisionsPageAsync>> =
            listRevisions(params, RequestOptions.none())

        /** @see listRevisions */
        fun listRevisions(
            emailId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailListRevisionsPageAsync>> =
            listRevisions(emailId, EmailListRevisionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /marketing/emails/2026-03/{emailId}/publish`, but
         * is otherwise the same as [EmailServiceAsync.publish].
         */
        fun publish(emailId: String): CompletableFuture<HttpResponse> =
            publish(emailId, EmailPublishParams.none())

        /** @see publish */
        fun publish(
            emailId: String,
            params: EmailPublishParams = EmailPublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            publish(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see publish */
        fun publish(
            emailId: String,
            params: EmailPublishParams = EmailPublishParams.none(),
        ): CompletableFuture<HttpResponse> = publish(emailId, params, RequestOptions.none())

        /** @see publish */
        fun publish(
            params: EmailPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see publish */
        fun publish(params: EmailPublishParams): CompletableFuture<HttpResponse> =
            publish(params, RequestOptions.none())

        /** @see publish */
        fun publish(
            emailId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            publish(emailId, EmailPublishParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /marketing/emails/2026-03/{emailId}/draft/reset`,
         * but is otherwise the same as [EmailServiceAsync.resetDraft].
         */
        fun resetDraft(emailId: String): CompletableFuture<HttpResponse> =
            resetDraft(emailId, EmailResetDraftParams.none())

        /** @see resetDraft */
        fun resetDraft(
            emailId: String,
            params: EmailResetDraftParams = EmailResetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            resetDraft(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see resetDraft */
        fun resetDraft(
            emailId: String,
            params: EmailResetDraftParams = EmailResetDraftParams.none(),
        ): CompletableFuture<HttpResponse> = resetDraft(emailId, params, RequestOptions.none())

        /** @see resetDraft */
        fun resetDraft(
            params: EmailResetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see resetDraft */
        fun resetDraft(params: EmailResetDraftParams): CompletableFuture<HttpResponse> =
            resetDraft(params, RequestOptions.none())

        /** @see resetDraft */
        fun resetDraft(
            emailId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            resetDraft(emailId, EmailResetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /marketing/emails/2026-03/{emailId}/revisions/{revisionId}/restore`, but is otherwise the
         * same as [EmailServiceAsync.restoreRevision].
         */
        fun restoreRevision(
            revisionId: String,
            params: EmailRestoreRevisionParams,
        ): CompletableFuture<HttpResponse> =
            restoreRevision(revisionId, params, RequestOptions.none())

        /** @see restoreRevision */
        fun restoreRevision(
            revisionId: String,
            params: EmailRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see restoreRevision */
        fun restoreRevision(params: EmailRestoreRevisionParams): CompletableFuture<HttpResponse> =
            restoreRevision(params, RequestOptions.none())

        /** @see restoreRevision */
        fun restoreRevision(
            params: EmailRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /marketing/emails/2026-03/{emailId}/revisions/{revisionId}/restore-to-draft`, but is
         * otherwise the same as [EmailServiceAsync.restoreRevisionToDraft].
         */
        fun restoreRevisionToDraft(
            revisionId: Long,
            params: EmailRestoreRevisionToDraftParams,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            restoreRevisionToDraft(revisionId, params, RequestOptions.none())

        /** @see restoreRevisionToDraft */
        fun restoreRevisionToDraft(
            revisionId: Long,
            params: EmailRestoreRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            restoreRevisionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreRevisionToDraft */
        fun restoreRevisionToDraft(
            params: EmailRestoreRevisionToDraftParams
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            restoreRevisionToDraft(params, RequestOptions.none())

        /** @see restoreRevisionToDraft */
        fun restoreRevisionToDraft(
            params: EmailRestoreRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmail>>

        /**
         * Returns a raw HTTP response for `post /marketing/emails/2026-03/{emailId}/unpublish`, but
         * is otherwise the same as [EmailServiceAsync.unpublish].
         */
        fun unpublish(emailId: String): CompletableFuture<HttpResponse> =
            unpublish(emailId, EmailUnpublishParams.none())

        /** @see unpublish */
        fun unpublish(
            emailId: String,
            params: EmailUnpublishParams = EmailUnpublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            unpublish(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see unpublish */
        fun unpublish(
            emailId: String,
            params: EmailUnpublishParams = EmailUnpublishParams.none(),
        ): CompletableFuture<HttpResponse> = unpublish(emailId, params, RequestOptions.none())

        /** @see unpublish */
        fun unpublish(
            params: EmailUnpublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see unpublish */
        fun unpublish(params: EmailUnpublishParams): CompletableFuture<HttpResponse> =
            unpublish(params, RequestOptions.none())

        /** @see unpublish */
        fun unpublish(
            emailId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            unpublish(emailId, EmailUnpublishParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /marketing/emails/2026-03/{emailId}/draft`, but is
         * otherwise the same as [EmailServiceAsync.updateDraft].
         */
        fun updateDraft(
            emailId: String,
            params: EmailUpdateDraftParams,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            updateDraft(emailId, params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            emailId: String,
            params: EmailUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            updateDraft(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see updateDraft */
        fun updateDraft(
            params: EmailUpdateDraftParams
        ): CompletableFuture<HttpResponseFor<PublicEmail>> =
            updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            params: EmailUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicEmail>>
    }
}
