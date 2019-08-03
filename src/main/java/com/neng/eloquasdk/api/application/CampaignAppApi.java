package com.neng.eloquasdk.api.application;

import com.neng.eloquasdk.exception.BadRequestException;
import com.neng.eloquasdk.model.Campaign;
/**
 * The classes that implement {@code CampaignAppApi} satisfies Oracle
 * Eloqua's Campaign REST 2.0 API.
 *
 * @author  Nicholas Eng
 * @see <a href="https://docs.oracle.com/cloud/latest/marketingcs_gs/OMCAC/api-application-2.0-campaigns.html">Oracle Eloqua Docs</a>
 */
public interface CampaignAppApi {

    /**
     * Activates an existing campaign on Eloqua.
     * The id argument must reference an existing {@link Campaign} on Eloqua. 
     * @author Nicholas Eng
     * @param id  a campaign id
     * @param activateNow a flag to activate the campaign immediately or not
     * @see <a href="https://docs.oracle.com/cloud/latest/marketingcs_gs/OMCAC/op-api-rest-2.0-assets-campaign-active-id-post.html">Oracle Eloqua Docs</a>
     */
    Campaign activate(Integer id, Boolean activateNow) throws BadRequestException;

    // /**
    //  * Activates an existing campaign on Eloqua.
    //  * The id argument must reference an existing {@link Campaign} on Eloqua. 
    //  * @author Nicholas Eng
    //  * @param id  a campaign id
    //  * @param runAsUserId a user to activate the campaign
    //  * @see <a href="https://docs.oracle.com/cloud/latest/marketingcs_gs/OMCAC/op-api-rest-2.0-assets-campaign-active-id-post.html">Oracle Eloqua Docs</a>
    //  */
    // Campaign activate(Integer id, Integer runAsUserId) throws BadRequestException;

    // /**
    //  * Activates an existing campaign on Eloqua.
    //  * The id argument must reference an existing {@link Campaign} on Eloqua. 
    //  * @author Nicholas Eng
    //  * @param id  a campaign id
    //  * @param scheduledFor a date and time for the campaign to activate on expressed in Unix time.
    //  * Alternatively, you can activate the campaign immediately by specifying 'now'.
    //  * @see <a href="https://docs.oracle.com/cloud/latest/marketingcs_gs/OMCAC/op-api-rest-2.0-assets-campaign-active-id-post.html">Oracle Eloqua Docs</a>
    //  */ 
    // Campaign activate(Integer id, String scheduledFor) throws BadRequestException;
    
    // /**
    //  * Activates an existing campaign on Eloqua. 
    //  * The id argument must reference an existing {@link Campaign} on Eloqua. 
    //  * @author Nicholas Eng
    //  * @param id  a campaign id
    //  * @param activateNow a flag to activate the campaign immediately or not
    //  * @param runAsUserId a user to activate the campaign
    //  * @see <a href="https://docs.oracle.com/cloud/latest/marketingcs_gs/OMCAC/op-api-rest-2.0-assets-campaign-active-id-post.html">Oracle Eloqua Docs</a>
    //  */ 
    // void activate(Integer id, Boolean activateNow, Integer runAsUserId) throws BadRequestException;

    // /**
    //  * Activates an existing campaign on Eloqua.
    //  * The id argument must reference an existing {@link Campaign} on Eloqua. 
    //  * @author Nicholas Eng
    //  * @param id  a campaign id
    //  * @param activateNow a flag to activate the campaign immediately or not
    //  * @param scheduledFor a date and time for the campaign to activate on expressed in Unix time.
    //  * Alternatively, you can activate the campaign immediately by specifying 'now'.
    //  * @see <a href="https://docs.oracle.com/cloud/latest/marketingcs_gs/OMCAC/op-api-rest-2.0-assets-campaign-active-id-post.html">Oracle Eloqua Docs</a>
    //  */ 
    // void activate(Integer id, Boolean activateNow, String scheduledFor) throws BadRequestException;

    // /**
    //  * Activates an existing campaign on Eloqua.
    //  * The id argument must reference an existing {@link Campaign} on Eloqua. 
    //  * @author Nicholas Eng
    //  * @param id  a campaign id
    //  * @param runAsUserId a user to activate the campaign
    //  * @param scheduledFor a date and time for the campaign to activate on expressed in Unix time.
    //  * Alternatively, you can activate the campaign immediately by specifying 'now'.
    //  * @see <a href="https://docs.oracle.com/cloud/latest/marketingcs_gs/OMCAC/op-api-rest-2.0-assets-campaign-active-id-post.html">Oracle Eloqua Docs</a>
    //  */ 
    // void activate(Integer id, Integer runAsUserId, String scheduledFor) throws BadRequestException;

    // /**
    //  * Activates an existing campaign on Eloqua. 
    //  * The id argument must reference an existing {@link Campaign} on Eloqua. 
    //  * @author Nicholas Eng
    //  * @param id  a campaign id
    //  * @param activateNow a flag to activate the campaign immediately or not
    //  * @param runAsUserId a user to activate the campaign
    //  * @param scheduledFor a date and time for the campaign to activate on expressed in Unix time.
    //  * Alternatively, you can activate the campaign immediately by specifying 'now'.
    //  * @see <a href="https://docs.oracle.com/cloud/latest/marketingcs_gs/OMCAC/op-api-rest-2.0-assets-campaign-active-id-post.html">Oracle Eloqua Docs</a>
    //  */ 
    // void activate(Integer id, Boolean activateNow, Integer runAsUserId, String scheduledFor) throws BadRequestException;

    // /**
    //  * Activates an existing campaign on Eloqua.
    //  * The id argument must reference an existing {@link Campaign} on Eloqua. 
    //  * 
    //  * <p>This method returns immediately, regardless of whether a response
    //  * has been received or not.</p>
    //  * @author Nicholas Eng
    //  * @param id a campaign id
    //  * @param activateNow a flag to activate the campaign immediately or not
    //  * @see <a href="https://docs.oracle.com/cloud/latest/marketingcs_gs/OMCAC/op-api-rest-2.0-assets-campaign-active-id-post.html">Oracle Eloqua Docs</a>
    //  * @see Mono
    //  */
    // Mono<Void> activateAsync(Integer id, Boolean activateNow) throws BadRequestException;

    // /**
    //  * Activates an existing campaign on Eloqua.
    //  * The id argument must reference an existing {@link Campaign} on Eloqua. 
    //  * 
    //  * <p>This method returns immediately, regardless of whether a response
    //  * has been received or not.</p>
    //  * @author Nicholas Eng
    //  * @param id a campaign id
    //  * @param runAsUserId a user to activate the campaign
    //  * @see <a href="https://docs.oracle.com/cloud/latest/marketingcs_gs/OMCAC/op-api-rest-2.0-assets-campaign-active-id-post.html">Oracle Eloqua Docs</a>
    //  * @see Mono
    //  */
    // Mono<Void> activateAsync(Integer id, Integer runAsUserId) throws BadRequestException;

    //  /**
    //  * Activates an existing campaign on Eloqua. 
    //  * The id argument must reference an existing {@link Campaign} on Eloqua. 
    //  * 
    //  * <p>This method returns immediately, regardless of whether a response
    //  * has been received or not.</p>
    //  * @author Nicholas Eng
    //  * @param id a campaign id
    //  * @param scheduledFor a date and time for the campaign to activate on expressed in Unix time.
    //  * Alternatively, you can activate the campaign immediately by specifying 'now'.
    //  * @see <a href="https://docs.oracle.com/cloud/latest/marketingcs_gs/OMCAC/op-api-rest-2.0-assets-campaign-active-id-post.html">Oracle Eloqua Docs</a>
    //  * @see Mono
    //  */
    // Mono<Void> activateAsync(Integer id, String scheduledFor) throws BadRequestException;
    
    // /**
    //  * Activates an existing campaign on Eloqua.
    //  * The id argument must reference an existing {@link Campaign} on Eloqua. 
    //  * 
    //  * <p>This method returns immediately, regardless of whether a response
    //  * has been received or not.</p>
    //  * @author Nicholas Eng
    //  * @param id  a campaign id
    //  * @param activateNow a flag to activate the campaign immediately or not
    //  * @param runAsUserId a user to activate the campaign
    //  * @see <a href="https://docs.oracle.com/cloud/latest/marketingcs_gs/OMCAC/op-api-rest-2.0-assets-campaign-active-id-post.html">Oracle Eloqua Docs</a>
    //  * @see Mono
    //  */
    // Mono<Void> activateAsync(Integer id, Boolean activateNow, Integer runAsUserId) throws BadRequestException;

    // /**
    //  * Activates an existing campaign on Eloqua.
    //  * The id argument must reference an existing {@link Campaign} on Eloqua. 
    //  * 
    //  * <p>This method returns immediately, regardless of whether a response
    //  * has been received or not.</p>
    //  * @author Nicholas Eng
    //  * @param id a campaign id
    //  * @param activateNow a flag to activate the campaign immediately or not
    //  * @param scheduledFor a date and time for the campaign to activate on expressed in Unix time.
    //  * Alternatively, you can activate the campaign immediately by specifying 'now'.
    //  * @see <a href="https://docs.oracle.com/cloud/latest/marketingcs_gs/OMCAC/op-api-rest-2.0-assets-campaign-active-id-post.html">Oracle Eloqua Docs</a>
    //  * @see Mono
    //  */
    // Mono<Void> activateAsync(Integer id, Boolean activateNow, String scheduledFor) throws BadRequestException;

    // /**
    //  * Activates an existing campaign on Eloqua. 
    //  * The id argument must reference an existing {@link Campaign} on Eloqua. 
    //  * 
    //  * <p>This method returns immediately, regardless of whether a response
    //  * has been received or not.</p>
    //  * @author Nicholas Eng
    //  * @param id  a campaign id
    //  * @param runAsUserId a user to activate the campaign
    //  * @param scheduledFor a date and time for the campaign to activate on expressed in Unix time.
    //  * Alternatively, you can activate the campaign immediately by specifying 'now'.
    //  * @see <a href="https://docs.oracle.com/cloud/latest/marketingcs_gs/OMCAC/op-api-rest-2.0-assets-campaign-active-id-post.html">Oracle Eloqua Docs</a>
    //  * @see Mono
    //  */
    // Mono<Void> activateAsync(Integer id, Integer runAsUserId, String scheduledFor) throws BadRequestException;

    // /**
    //  * Activates an existing campaign on Eloqua.
    //  * The id argument must reference an existing {@link Campaign} on Eloqua. 
    //  * 
    //  * <p>This method returns immediately, regardless of whether a response
    //  * has been received or not.</p>
    //  * @author Nicholas Eng
    //  * @param id  a campaign id
    //  * @param activateNow a flag to activate the campaign immediately or not
    //  * @param runAsUserId a user to activate the campaign
    //  * @param scheduledFor a date and time for the campaign to activate on expressed in Unix time.
    //  * Alternatively, you can activate the campaign immediately by specifying 'now'.
    //  * @see <a href="https://docs.oracle.com/cloud/latest/marketingcs_gs/OMCAC/op-api-rest-2.0-assets-campaign-active-id-post.html">Oracle Eloqua Docs</a>
    //  * @see Mono
    //  */
    // Mono<Void> activateAsync(Integer id, Boolean activateNow, Integer runAsUserId, String scheduledFor) throws BadRequestException;

    // /**
    //  * Returns a response for activating a campaign. 
    //  * @author Nicholas Eng
    //  * @param campaign a campaign to create on Eloqua
    //  * @return the campaign that was created
    //  * @see <a href="https://docs.oracle.com/cloud/latest/marketingcs_gs/OMCAC/op-api-rest-2.0-assets-campaign-post.html">Oracle Eloqua Docs</a>
    //  */
    // Campaign create(Campaign campaign) throws BadRequestException;

    // /**
    //  * Returns a response for activating a campaign. 
    //  * 
    //  * <p>This method returns immediately, regardless of whether a response
    //  * has been received or not.</p>
    //  * @author Nicholas Eng
    //  * @param campaign a campaign to create on Eloqua
    //  * @return the campaign that was created
    //  * @see <a href="https://docs.oracle.com/cloud/latest/marketingcs_gs/OMCAC/op-api-rest-2.0-assets-campaign-post.html">Oracle Eloqua Docs</a>
    //  * @see Mono
    //  */
    // Mono<Campaign> createAsync(Campaign campaign) throws BadRequestException;

    // Campaign deactivate(Integer id) throws BadRequestException;

    // Mono<Campaign> deactivateAsync(Integer id) throws BadRequestException;

    // void delete(Integer id) throws BadRequestException;

    // Mono<Void> deleteAsync(Integer id) throws BadRequestException;

    // Campaign retrieve(Integer id) throws BadRequestException;

    // Campaign retrieve(Integer id, Depth depth) throws BadRequestException;

    // Mono<Campaign> retrieveAsync(Integer id) throws BadRequestException;

    // Mono<Campaign> retrieveAsync(Integer id, Depth depth) throws BadRequestException;

    // EloquaAppList<Campaign> retrieveList() throws BadRequestException;

    // EloquaAppList<Campaign> retrieveList(Integer count) throws BadRequestException;

    // EloquaAppList<Campaign> retrieveList(Integer count, Integer page) throws BadRequestException;

    // EloquaAppList<Campaign> retrieveList(Integer count, Depth depth, Integer page) throws BadRequestException;

    // EloquaAppList<Campaign> retrieveList(Integer count, Depth depth, Integer lastUpdatedAt, String orderBy, Integer page, String search) throws BadRequestException;

    // Mono<EloquaAppList<Campaign>> retrieveListAsync() throws BadRequestException;

    // Mono<EloquaAppList<Campaign>> retrieveListAsync(Integer count) throws BadRequestException;

    // Mono<EloquaAppList<Campaign>> retrieretrieveListAsyncveList(Integer count, Integer page) throws BadRequestException;

    // Mono<EloquaAppList<Campaign>> retrieveListAsync(Integer count, Depth depth, Integer page) throws BadRequestException;

    // Mono<EloquaAppList<Campaign>> retrieveListAsync(Integer count, Depth depth, Integer lastUpdatedAt, String orderBy, Integer page, String search) throws BadRequestException;

    // Campaign update(String id) throws BadRequestException;

    // Mono<Campaign> updateAsync(String id) throws BadRequestException;
}